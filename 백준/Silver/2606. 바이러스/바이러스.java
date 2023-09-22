import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static int com;
    static int link;
    static int[][] arr;
    static boolean[] check;
    static int cnt;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 컴퓨터 수
        com = Integer.parseInt(br.readLine());
        // 연결된 컴퓨터 쌍의 수
        link = Integer.parseInt(br.readLine());

        // 인접 행렬
        arr = new int[com+1][com+1];
        // 방문 여부
        check = new boolean[com + 1];
        // 바이러스에 걸린 컴퓨터 수
        cnt = 0;

        for(int i=0;i < link;i++) {
            String[] line = br.readLine().split(" ");
            int a = Integer.parseInt(line[0]);
            int b = Integer.parseInt(line[1]);

            arr[a][b] = arr[b][a] = 1;
        }

        dfs(1);
        // 바이러스에 걸린 컴퓨터 수에서 시작 컴퓨터는 빼준다.
        System.out.println(cnt - 1);
    }

    static void dfs(int start) {
        check[start] = true;
        cnt++;

        for(int i=0;i < arr[start].length;i++) {
            if(!check[i] && arr[start][i] == 1) {
                dfs(i);
            }
        }
    }
}

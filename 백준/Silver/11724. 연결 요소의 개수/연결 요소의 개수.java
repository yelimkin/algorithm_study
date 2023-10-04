import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main { // 연결 요소의 개수
    static int N;
    static int M;
    static int[][] arr;
    static boolean[] check;
    // 연결 요소 수
    static int cnt = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = br.readLine().split(" ");
        // 정점의 개수
        N = Integer.parseInt(nm[0]);
        // 간선의 개수
        M = Integer.parseInt(nm[1]);

        // 인접 행렬
        arr = new int[N+1][N+1];
        for(int i=0;i < M;i++) {
            String[] connect = br.readLine().split(" ");
            int a = Integer.parseInt(connect[0]);
            int b = Integer.parseInt(connect[1]);

            arr[a][b] = arr[b][a] = 1;
        }

        // 방문 여부
        check = new boolean[N+1];

        for(int j=1;j <= N;j++) {
            // 방문하지 않은 정점 탐색
            if(!check[j]) {
                // 탐색 시작하면 먼저 연결 요소 개수 증가
                cnt++;
//                System.out.println("j : " + j);
                for(int k=1;k <= N;k++) {
                    // 이 정점과 연결된 정점 찾기
                    if(arr[j][k] == 1) {
                        // dfs 함수에서 연결된 정점 방문 처리
                        dfs(k);
                    }
                }
            }
        }

        System.out.println(cnt);

    }

    // 3 2
    // 3 1
    // 2 1
    static void dfs(int i) {
        check[i] = true;

        for(int j=1;j <= N;j++) {
            if(!check[j] && arr[i][j] == 1) {
                dfs(j);
            }
        }
    }
}

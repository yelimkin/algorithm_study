import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static int N;
    static int M;
    static int K;
    static int[][] arr;
    static boolean[][] check;

    // 열 - 위, 오른쪽, 아래, 왼쪽
    static int[] dn = {0, 1, 0, -1};
    // 행 - 위, 오른쪽, 아래, 왼쪽
    static int[] dm = {-1, 0, 1, 0};
    static int cn, cm;
    // 배추가 모여 있는 지점 수
    static int count = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 테스트 케이스
        int T = Integer.parseInt(br.readLine());

        for(int i=0;i < T;i++) {
            count = 0;
            String[] str = br.readLine().split(" ");

            // 밭의 가로 길이(열)
            N = Integer.parseInt(str[0]);
            // 밭의 세로 길이(행)
            M = Integer.parseInt(str[1]);
            // 배추가 심어진 위치 개수
            K = Integer.parseInt(str[2]);

            arr = new int[M][N];
            check = new boolean[M][N];

            for(int j=0;j < K;j++) {
                String[] point = br.readLine().split(" ");

                int a = Integer.parseInt(point[0]);
                int b = Integer.parseInt(point[1]);

                arr[b][a] = 1;
            }

            for(int k=0;k < M;k++) {
                for(int l=0;l < N;l++) {
                    if(!check[k][l] && arr[k][l] == 1) {
//                        System.out.println("k : " + k + ", l : " + l);
                        count++;
                        dfs(k, l);
                    }
                }
            }

            System.out.println(count);
        }
    }

    static void dfs(int k, int l) {
        check[k][l] = true;

        for(int i=0;i < 4;i++) {
            // 열
            cn = dn[i] + l;
            // 행
            cm = dm[i] + k;
            if(cn >= 0 && cm >= 0 && cn < N && cm < M) {
                if(!check[cm][cn] && arr[cm][cn] == 1) {
                    dfs(cm, cn);
                }
            }
        }
    }
}

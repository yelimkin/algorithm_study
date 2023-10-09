import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Queue;
import java.util.LinkedList;

public class Main { // 적록색약
    static int N;
    static String[][] arr;
    static boolean[][] check;
    static String[][] rgArr;
    static boolean[][] rgCheck;
    static Queue<int []> q;
    static Queue<int []> rgQ;
    // 적록색약이 아닌 사람이 본 구역의 수
    static int cnt;
    // 적록색약인 사람이 본 구역의 수
    static int rgCnt;
    // 위, 오른쪽, 아래, 왼쪽
    static int[] di = {-1, 0, 1, 0};
    static int[] dj = {0, 1, 0, -1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 그림 크기
        N = Integer.parseInt(br.readLine());
        // 적록색약이 아닌 사람이 볼 그림
        arr = new String[N][N];
        // 적록색약인 사람이 볼 그림
        rgArr = new String[N][N];
        for(int i=0;i < N;i++) {
            String[] str = br.readLine().split("");
            for(int j=0;j < N;j++) {
                arr[i][j] = str[j];
                rgArr[i][j] = str[j];
            }
        }
        // 각 그림의 방문 여부
        check = new boolean[N][N];
        rgCheck = new boolean[N][N];
        // 각 그림의 bfs를 위한 큐
        q = new LinkedList<>();
        rgQ = new LinkedList<>();

        for(int k=0;k < N;k++) {
            for(int l=0;l < N;l++) {
                String color = arr[k][l];

                // 적록색약이 아닌 사람
                // 이 구역이 R일 때
                if(!check[k][l] && color.equals("R")) {
                    cnt++;
                    bfs(k, l, "R");
                }
                // 이 구역이 G일 때
                else if(!check[k][l] && color.equals("G")) {
                    cnt++;
                    bfs(k, l, "G");
                }
                // 이 구역이 B일 때
                else if(!check[k][l] && color.equals("B")) {
                    cnt++;
                    bfs(k, l, "B");
                }

                // 적록색약인 사람
                // 이 구역이 R이거나 G일 때
                if(!rgCheck[k][l] && (color.equals("R") || color.equals("G"))) {
                    rgCnt++;
                    rgBfs(k, l, color);
                }
                // 이 구역이 B일 때
                else if(!rgCheck[k][l] && color.equals("B")) {
                    rgCnt++;
                    rgBfs(k, l, "B");
                }
            }
        }

        System.out.println(cnt + " " + rgCnt);
    }

    static void bfs(int i, int j, String color) {
        check[i][j] = true;
        int[] start = {i, j};
        q.add(start);

        while(!q.isEmpty()) {
            int[] tmp = q.poll();

            int x = tmp[0];
            int y = tmp[1];
            for(int k=0;k < 4;k++) {
                int ci = di[k] + x;
                int cj = dj[k] + y;

                if(ci >= 0 && cj >= 0 && ci < N && cj < N) {
                    if(!check[ci][cj] && arr[ci][cj].equals(color)) {
                        check[ci][cj] = true;
                        q.add(new int[] {ci, cj});
                    }
                }
            }
        }
    }

    static void rgBfs(int i, int j, String color) {
        rgCheck[i][j] = true;
        int[] start = {i, j};
        rgQ.add(start);

        while(!rgQ.isEmpty()) {
            int[] tmp = rgQ.poll();

            int x = tmp[0];
            int y = tmp[1];
            for(int k=0;k < 4;k++) {
                int ci = di[k] + x;
                int cj = dj[k] + y;

                if(ci >= 0 && cj >= 0 && ci < N && cj < N) {
                    if(color.equals("R") || color.equals("G")) {
                        if(!rgCheck[ci][cj] && (rgArr[ci][cj].equals("R") || rgArr[ci][cj].equals("G"))) {
                            rgCheck[ci][cj] = true;
                            rgQ.add(new int[] {ci, cj});
                        }
                    }else {
                        if(!rgCheck[ci][cj] && rgArr[ci][cj].equals(color)) {
                            rgCheck[ci][cj] = true;
                            rgQ.add(new int[] {ci, cj});
                        }
                    }
                }
            }
        }
    }
}

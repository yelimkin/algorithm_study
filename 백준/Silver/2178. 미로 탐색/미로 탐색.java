import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
    static int N;
    static int M;
    static int[][] map;
    // 기준 탐색 좌표의 상, 하, 좌, 우
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, 1, 0, 0};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = br.readLine().split(" ");

        // 세로
        N = Integer.parseInt(nm[0]);
        // 가로
        M = Integer.parseInt(nm[1]);

        // 미로
        map = new int[N][M];
        for(int i=0;i < N;i++) {
            String[] row = br.readLine().split("");
            for(int j=0;j < M;j++) {
                map[i][j] = Integer.parseInt(row[j]);
            }
        }

        // 출발 좌표는 (1, 1)
        // 하지만 미로 구성을 저장한 배열에 맞게 시작하려면 (0, 0)
        bfs(0, 0);

        System.out.println(map[N-1][M-1]);
    }

    static void bfs(int x, int y) {
        // bfs 탐색을 위한 큐
        Queue<int[]> q = new LinkedList<>();

        // bfs 탐색을 위해 시작 좌표를 큐에 넣기
        int[] start = {x, y};
        q.add(start);

        while(!q.isEmpty()) {
            int[] tmp = q.poll();

            // 기준 좌표에서 이동할 수 있는 좌표 탐색을 위해
            for(int k=0;k < 4;k++) {
                int cx = tmp[0] + dx[k];
                int cy = tmp[1] + dy[k];

                // 미로의 범위를 벗어나지 않는 좌표인지
                if(cx >= 0 && cy >= 0 && cx < N && cy < M) {
                    // 방문한 적 없고 이동할 수 있는 좌표인 경우,
                    // 시작 좌표를 제외한 지나온 좌표는 모두 1 이상
                    if(map[cx][cy] == 1) {
                        int[] put = {cx, cy};
                        q.add(put);
                        // 미로의 기준 좌표의 값에 1을 더한 값을 넣어주어
                        // 몇 개의 칸을 지나왔는지 미로에 표시
                        map[cx][cy] = map[tmp[0]][tmp[1]] + 1;
                    }
                }

            }
        }
    }

}

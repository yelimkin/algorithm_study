import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    static int N;
    static int[][] arr;
    static boolean[][] visited;
    // 지도 좌표 상, 하, 좌, 우
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, 1, 0, 0};
    static int group;
    static int cnt;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 지도의 크기
        N = Integer.parseInt(br.readLine());

        // 지도 초기화
        arr = new int[N][N];
        for(int i=0;i < N;i++) {
            String[] row = br.readLine().split("");
            for(int j=0;j < N;j++) {
                arr[i][j] = Integer.parseInt(row[j]);
            }
        }

        // 각 좌표 방문 여부 배열 초기화
        visited = new boolean[N][N];

        // 단지 수
        group = 0;
        // 단지내 집의 수
        // 지도에서 1인 좌표에서 미리 세고 탐색하기 때문에 1
        cnt = 1;
        // 단지내 집의 수 저장 배열
        ArrayList<Integer> house = new ArrayList<>();

        for(int k=0;k < N;k++) {
            for(int l=0;l < N;l++) {
                if(!visited[k][l] && arr[k][l] == 1) {
                    // 단지 하나에 대한 dfs 시작
                    dfs(k, l);
                    // 단지 수 증가
                    group++;
                    // 탐색한 한 단지에 대해 단지 내 집의 수 저장
                    house.add(cnt);
                    // 다음 단지를 위해 초기화
                    cnt = 1;
                }
            }
        }

        System.out.println(group);

        // 각 단지내 집의 수 오름차순 정렬
        Collections.sort(house);
        StringBuilder sb = new StringBuilder();
        for(int h=0;h < house.size();h++) {
            sb.append(house.get(h));
            sb.append("\n");
        }

        System.out.println(sb);

    }

    static void dfs(int x, int y) {
        visited[x][y] = true;

        for(int i=0;i < 4;i++) {
            int cx = x + dx[i];
            int cy = y + dy[i];

            if(cx >= 0 && cx < N && cy >= 0 && cy < N){
                if(!visited[cx][cy] && arr[cx][cy] == 1) {
                    dfs(cx, cy);
                    cnt++;
                }
            }
        }
    }
}

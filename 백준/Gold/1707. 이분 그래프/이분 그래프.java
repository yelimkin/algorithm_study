import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayList;

public class Main {
    static int V;
    static int E;
    static ArrayList<Integer>[] lst;
    static StringBuilder sb;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        int test = Integer.parseInt(br.readLine());

        for(int t=0;t < test;t++) {
            String[] ve = br.readLine().split(" ");

            // 정점의 개수
            V = Integer.parseInt(ve[0]);
            // 간선의 개수
            E = Integer.parseInt(ve[1]);

            // 인접 리스트
            lst = new ArrayList[V+1];
            for(int i=1;i < V+1;i++) {
                lst[i] = new ArrayList<>();
            }

            // 첫번째로 입력받는 간선 정보에서 탐색 시작점 가져오기
            for(int i=0;i < E;i++) {
                String[] link = br.readLine().split(" ");
                int a = Integer.parseInt(link[0]);
                int b = Integer.parseInt(link[1]);

                lst[a].add(b);
                lst[b].add(a);
            }

            // 각 정점의 색
            int[] color = new int[V+1];

            sb.append(bfs(color));
            sb.append("\n");

        }
        System.out.println(sb);
    }

    static String bfs(int[] color) {
        // 색 칠하기
        Queue<Integer> q = new LinkedList<>();
        // 색 (예/ 1 = 빨강, -1 = 파랑)
        int c = 1;

        // 각 정점의 색을 저장한 배열인 color의 값이 0이면
        // 탐색을 시작하여 색을 아래 코드에서 칠한다.
        for(int k=1;k <= V;k++) {
            if(color[k] == 0) {
                q.add(k);
                color[k] = c;
            }

            while(!q.isEmpty()) {
                int idx = q.poll();

                for(int i=0;i < lst[idx].size();i++) {
                    // 인접했는데 아직 색이 안 칠해진 경우
                    if(color[lst[idx].get(i)] == 0) {
                        q.add(lst[idx].get(i));
                        // 인접한 정점 색 반전
                        color[lst[idx].get(i)] = color[idx] * -1;
                    } // 인접했는데 인접 정점과 같은 색인 경우
                    else if(color[idx] == color[lst[idx].get(i)]) {
                        return "NO";
                    }
                }
            }
        }
        return "YES";
    }
}

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
    static int N;
    static int M;
    static int[][] arr;
    static Queue<Integer> q;
    static boolean[] visited;
    static StringBuilder answer;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nmv = br.readLine().split(" ");

        // 정점의 개수
        N = Integer.parseInt(nmv[0]);
        // 간선의 개수
        M = Integer.parseInt(nmv[1]);
        // 시작 정점
        int V = Integer.parseInt(nmv[2]);

        // 인접 행렬
        arr = new int[N+1][N+1];
        // 인접 행렬에 간선 정보 저장
        for(int i=0;i < M;i++) {
            String[] link = br.readLine().split(" ");

            int a = Integer.parseInt(link[0]);
            int b = Integer.parseInt(link[1]);

            // 양방향 그래프
            arr[a][b] = 1;
            arr[b][a] = 1;
        }

        // 각 정점 방문 여부 배열 초기화
        visited = new boolean[N+1];

        // 깊이 우선 탐색한 정점을 저장할 StringBuilder
        answer = new StringBuilder();
        // 깊이 우선 탐색
        dfs(V);
        System.out.println(answer);

        // 각 정점 방문 여부 배열 초기화
        visited = new boolean[N+1];

        // 너비 우선 탐색한 정점을 저장할 StringBuilder
        answer = new StringBuilder();
        // 너비 우선 탐색을 위한 큐
        q = new LinkedList<>();
        // 너비 우선 탐색
        bfs(V);
        System.out.println(answer);

    }

    static void dfs(int start) {
        visited[start] = true;
        answer.append(start + " ");

        for(int j=1;j < arr[start].length;j++) {
            if(!visited[j] && arr[start][j] == 1) {
                dfs(j);
            }
        }
    }

    static void bfs(int start) {
        visited[start] = true;
        q.add(start);

        while(!q.isEmpty()) {
            int node = q.poll();
            answer.append(node + " ");

            for(int k=1;k < arr[node].length;k++) {
                if(!visited[k] && arr[node][k] == 1) {
                    visited[k] = true;
                    q.add(k);
                }
            }
        }
    }
}

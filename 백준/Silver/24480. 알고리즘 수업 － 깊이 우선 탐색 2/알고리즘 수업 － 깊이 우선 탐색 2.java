import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    static int N;
    static int M;
    static ArrayList<Integer>[] lst;
    static int seq;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nmr = br.readLine().split(" ");

        // 정점의 수
        N = Integer.parseInt(nmr[0]);
        // 간선의 수
        M = Integer.parseInt(nmr[1]);
        // 시작 정점
        int R = Integer.parseInt(nmr[2]);

        // 인접 리스트
        lst = new ArrayList[N+1];

        // 각 정점에 연결된 정점들을 저장할 ArrayList 초기화
        for(int l=1;l < N+1;l++) {
            lst[l] = new ArrayList<>();
        }

        for(int i=0;i < M;i++) {
            String[] link = br.readLine().split(" ");

            int a = Integer.parseInt(link[0]);
            int b = Integer.parseInt(link[1]);

            lst[a].add(b);
            lst[b].add(a);
        }

        for(ArrayList node : lst) {
            if(node != null) {
                Collections.sort(node, Collections.reverseOrder());
            }
        }

        boolean[] visited = new boolean[N+1];
        int[] answer = new int[N+1];

        seq = 1;
        dfs(R, visited, answer);

        StringBuilder sb = new StringBuilder();
        for(int k=1;k < answer.length;k++) {
            sb.append(answer[k]);
            sb.append("\n");
        }

        System.out.println(sb);
    }

    static void dfs(int start, boolean[] visited, int[] answer) {
        visited[start] = true;
        answer[start] = seq++;

        for(int j=0;j < lst[start].size();j++) {
            if(!visited[lst[start].get(j)]) {
                dfs(lst[start].get(j), visited, answer);
            }
        }
    }
}

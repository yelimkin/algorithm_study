import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Collections;

public class Main {
    static int N;
    static int M;
    static Queue<Integer> q;
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

        // 너비 우선 탐색을 위한 큐
        q = new LinkedList<>();
        // 간선 정보를 담는 인접 리스트
        lst = new ArrayList[N+1];

        for(int i=1;i < N+1;i++) {
            lst[i] = new ArrayList<>();
        }

        for(int j=0;j < M;j++) {
            String[] link = br.readLine().split(" ");

            int a = Integer.parseInt(link[0]);
            int b = Integer.parseInt(link[1]);

            lst[a].add(b);
            lst[b].add(a);
        }

        for(ArrayList node : lst) {
            if(node != null && node.size() > 1) {
                Collections.sort(node, Collections.reverseOrder());
            }
        }

        boolean[] visited = new boolean[N+1];
        int[] answer = new int[N+1];

        seq = 1;
        bfs(R, visited, answer);

        StringBuilder sb = new StringBuilder();
        for(int l=1;l < answer.length;l++) {
            sb.append(answer[l]);
            sb.append("\n");
        }

        System.out.println(sb);
    }

    static void bfs(int start, boolean[] visited, int[] answer) {
        visited[start] = true;
        q.add(start);

        while(!q.isEmpty()) {
            int n = q.poll();
            answer[n] = seq++;

            for(int k=0;k < lst[n].size();k++) {
                if(!visited[lst[n].get(k)]) {
                    visited[lst[n].get(k)] = true;
                    q.add(lst[n].get(k));
                }
            }
        }
    }
}

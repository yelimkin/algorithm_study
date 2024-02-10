import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

class Road implements Comparable<Road> {
    int end;
    int cost;

    Road(int end, int weight) {
        this.end = end;
        this.cost = weight;
    }

    @Override
    public int compareTo(Road o) {
        return cost - o.cost;
    }
}
public class Main {
    static int N;
    static int M;
    static ArrayList<ArrayList<Road>> lst;
    static int[] dist;
    static boolean[] check;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] nmx = br.readLine().split(" ");
        // 마을 수, 학생 수 (1 ≤ N ≤ 1,000)
        N = Integer.parseInt(nmx[0]);
        // 도로 수 (1 ≤ M ≤ 10,000), 단방향
        M = Integer.parseInt(nmx[1]);
        // 파티를 할 마을, 시작점 (1 ≤ N ≤ 1,000)
        int X = Integer.parseInt(nmx[2]);

        // 학생들 중 오고 가는데 가장 오래 걸리는 학생의 소요 시간
        lst = new ArrayList<>();
        for(int i=0;i <= N;i++) {
            lst.add(new ArrayList<>());
        }

        // 시작점에서 각 정점으로 가는 최단 거리
        dist = new int[N+1];
        Arrays.fill(dist, Integer.MAX_VALUE);

        for(int i=0;i < M;i++) {
            String[] input = br.readLine().split(" ");

            int start = Integer.parseInt(input[0]);
            int end = Integer.parseInt(input[1]);
            int cost = Integer.parseInt(input[2]);

            lst.get(start).add(new Road(end, cost));
        }

        int result = 0;
        for(int j=1;j <= N;j++) {
            if(j == X) continue;
            int goDist = dijkstra(j, X);
            preset();
            int backDist = dijkstra(X, j);
            preset();
            result = Math.max(result, goDist + backDist);
        }

        System.out.println(result);
        br.close();
    }

    static int dijkstra(int start, int end) {
        PriorityQueue<Road> pq = new PriorityQueue<>();
        check = new boolean[N+1];
        pq.offer(new Road(start, 0));
        dist[start] = 0;

        while(!pq.isEmpty()) {
            Road curRoad = pq.poll();
            int cur = curRoad.end;

            if(!check[cur]) {
                check[cur] = true;

                for(Road r : lst.get(cur)) {
                    if(!check[r.end] && dist[r.end] > (dist[cur] + r.cost)) {
                        dist[r.end] = dist[cur] + r.cost;
                        pq.add(new Road(r.end, dist[r.end]));
                    }
                }
            }
        }

        return dist[end];
    }

    static void preset() {
        dist = new int[N+1];
        Arrays.fill(dist, Integer.MAX_VALUE);
    }
}

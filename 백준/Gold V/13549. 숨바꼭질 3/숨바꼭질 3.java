import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] arsg) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] nk = br.readLine().split(" ");
        int N = Integer.parseInt(nk[0]);
        int K = Integer.parseInt(nk[1]);

        // int[] = {위치, 시간}
        // 시간이 적게 걸리는 것부터
        PriorityQueue<int[]> pq = new PriorityQueue<>((x, y) -> x[1] - y[1]);
        boolean[] check = new boolean[100001];

        int cnt = 0;
        int[] start = {N, 0};
        pq.add(start);
        while(!pq.isEmpty()) {
            int[] now = pq.poll();
            int nPosition = now[0]; // 현재 위치
            cnt = now[1];

            if(nPosition == K) {
                break;
            }

            check[nPosition] = true;

            // 3가지 이동 경우,
            // 현재 위치 X 2인 위치가 범위 안에 있고 방문한 적 없다면
            if(nPosition * 2 <= 100000 && !check[nPosition * 2]) {
                pq.offer(new int[] {nPosition * 2, cnt}); // 이동할 위치로 순간이동
            }

            // 현재 위치 + 1인 위치가 동생의 위치 전이고 범위 안에 있고 방문한 적 없다면
            if(nPosition < K && nPosition + 1 <= 100000 && !check[nPosition + 1]) {
                pq.offer(new int[] {nPosition + 1, cnt + 1}); // 이동할 위치로 가고 시간도 반영
            }

            // 현재 위치 - 1인 위치가 범위 안이고 방문한 적 없다면
            if(nPosition - 1 >= 0 && !check[nPosition - 1]) {
                pq.offer(new int[] {nPosition - 1, cnt + 1}); // 이동할 위치로 가고 시간도 반영
            }
        }

        System.out.println(cnt);
        br.close();
    }
}

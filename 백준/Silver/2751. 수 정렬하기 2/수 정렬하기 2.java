import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine()); // 1 <= N <= 1000000
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for(int i=0;i < N;i++) {
            int num = Integer.parseInt(br.readLine());
            heap.add(num); // 우선 순위큐 삽입 O(logN)
        }

        for(int j=0;j < N;j++) {
            sb.append(heap.poll()).append(" "); // 우선 순위큐 삭제(꺼낼 때) O(logN)
        }
        System.out.println(sb);
        br.close();
    }
}

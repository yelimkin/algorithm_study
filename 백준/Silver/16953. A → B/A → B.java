import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 1 ≤ A < B ≤ 10^9
        String[] ab = br.readLine().split(" ");
        int A = Integer.parseInt(ab[0]);
        int B = Integer.parseInt(ab[1]);

        long result = -1;
        Queue<long[]> q = new LinkedList<>();
        q.add(new long[] {A, 0});
        while(!q.isEmpty()) {
            long[] curr = q.poll();
            long num = curr[0];
            long cnt = curr[1];

            String strNum = String.valueOf(num);
            long putOne = Long.parseLong( strNum + "1");

            if(num == B) {
                result = cnt + 1;
                break;
            }

            // 두가지 연산
            // 2를 곱한다.
            if(num * 2 <= B) {
                q.offer(new long[] {num * 2, cnt + 1});
            }
            // 1을 수의 가장 오른쪽에 추가한다.
            if(putOne <= B) {
                q.offer(new long[] {putOne, cnt + 1});
            }
        }

        System.out.println(result);
        br.close();
    }
}

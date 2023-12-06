import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.ArrayDeque;

// 요세푸스 문제와 비슷한 문제
// 하지만 한 방향으로만 움직이지 않고 두 방향으로 움직이며 제거하므로
// 덱을 사용한다.
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        String[] num = br.readLine().split(" ");
        Deque<int[]> dq = new ArrayDeque<>();
        for(int i=0;i < N;i++) {
            int[] tmp = {i+1, Integer.parseInt(num[i])};
            dq.offerLast(tmp);
        }

        int[] first = dq.pollFirst();
        sb.append(first[0]).append(" ");
        // 풍선 속 종이 번호
        int bn = first[1];
        while(dq.size() > 1) {
            int[] blln;
            if(bn > 0) {
                move(dq, bn - 1);
                blln = dq.pollFirst();
            }else {
                move(dq, bn + 1);
                blln = dq.pollLast();
            }
            sb.append(blln[0]).append(" ");
            bn = blln[1];
        }
        int[] last = dq.pollFirst();
        sb.append(last[0]);

        System.out.println(sb);
    }

    static void move(Deque<int[]> dq, int n) {
        if(n < 0) {
            while(n < 0) {
                dq.offerFirst(dq.pollLast());
                n++;
            }
        }else {
            while(n > 0) {
                dq.offerLast(dq.pollFirst());
                n--;
            }
        }
    }
}

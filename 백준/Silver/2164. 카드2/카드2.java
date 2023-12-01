import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        // 차례로 꺼내면서 확인할 큐
        Queue<Integer> q = new LinkedList<>();
        for(int i=1;i <= N;i++) {
            q.offer(i);
        }

        // true : 맨 위 카드 버리기, false : 맨 위 카드를 맨 뒤로 보내기
        boolean check = true;
        while(q.size() > 1) {
            if(check) {
                q.poll();
            }else {
                int back = q.poll();
                q.offer(back);
            }
            check = !check;
        }
        System.out.println(q.poll());
        br.close();
    }
}

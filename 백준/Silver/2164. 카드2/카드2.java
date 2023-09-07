import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i < n;i++) {
            q.offer(i+1);
        }

        while(q.size() > 1) {
            q.remove();
            if(q.size() == 1) break;
            int tmp = q.peek();
            q.remove();
            q.offer(tmp);
        }

        System.out.println(q.peek());
    }
}

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        Queue<Integer> q = new LinkedList<>();
        // 맨 마지막 값
        int last = 0;

        for(int i=0;i < N;i++) {
            String str = br.readLine();
            if(str.contains("push")) {
                String[] num = str.split(" ");
                last = Integer.parseInt(num[1]);
                q.offer(last);
            }
            if(str.equals("pop")) {
                if(q.isEmpty()) {
                    sb.append("-1\n");
                }else {
                    sb.append(q.poll() + "\n");
                }
            }
            if(str.equals("size")) {
                sb.append(q.size() + "\n");
            }
            if(str.equals("empty")) {
                if(q.isEmpty()) {
                    sb.append("1\n");
                }else {
                    sb.append("0\n");
                }
            }
            if(str.equals("front")) {
                if(q.isEmpty()) {
                    sb.append("-1\n");
                }else {
                    sb.append(q.peek() + "\n");
                }
            }
            if(str.equals("back")) {
                if(q.isEmpty()) {
                    sb.append("-1\n");
                }else {
                    sb.append(last + "\n");
                }
            }
        }

        System.out.println(sb);
    }
}

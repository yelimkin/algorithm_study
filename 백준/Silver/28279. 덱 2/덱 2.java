import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        Deque<Integer> dq = new ArrayDeque<>();
        for(int i=0;i < N;i++) {
            String str = br.readLine();

            if(str.startsWith("1")) {
                String[] num1 = str.split(" ");
                dq.offerFirst(Integer.parseInt(num1[1]));
            }
            if(str.startsWith("2")) {
                String[] num2 = str.split(" ");
                dq.offerLast(Integer.parseInt(num2[1]));
            }
            if(str.equals("3")) {
                if(!dq.isEmpty()) {
                    sb.append(dq.pollFirst()).append("\n");
                }else {
                    sb.append("-1\n");
                }
            }
            if(str.equals("4")) {
                if(!dq.isEmpty()) {
                    sb.append(dq.pollLast()).append("\n");
                }else {
                    sb.append("-1\n");
                }
            }
            if(str.equals("5")) {
                sb.append(dq.size()).append("\n");
            }
            if(str.equals("6")) {
                if(!dq.isEmpty()) {
                    sb.append("0\n");
                }else {
                    sb.append("1\n");
                }
            }
            if(str.equals("7")) {
                if(!dq.isEmpty()) {
                    sb.append(dq.peekFirst()).append("\n");
                }else {
                    sb.append("-1\n");
                }
            }
            if(str.equals("8")) {
                if(!dq.isEmpty()) {
                    sb.append(dq.peekLast()).append("\n");
                }else {
                    sb.append("-1\n");
                }
            }
        }

        System.out.println(sb);
        br.close();
    }
}

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 명령 수
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> st = new Stack<>();

        for(int i=0;i < N;i++) {
            String str = br.readLine();

            if(str.startsWith("1")) { // 스택에 넣기
                String[] num = str.split(" ");
                st.push(Integer.parseInt(num[num.length - 1]));
            }
            if(str.equals("2")) { // 정수가 있으면 정수 빼고 출력
                if(!st.empty()) {
                    sb.append(st.pop() + "\n");
                } else {
                    sb.append("-1\n");
                }
            }
            if(str.equals("3")) { // 스택의 정수 개수
                sb.append(st.size() + "\n");
            }
            if(str.equals("4")) { // 스택이 비어 있는지
                if(st.empty()) {
                    sb.append("1\n");
                }else {
                    sb.append("0\n");
                }
            }
            if(str.equals("5")) { // 정수가 있으면 정수 출력
                if(!st.empty()) {
                    sb.append(st.peek() + "\n");
                } else {
                    sb.append("-1\n");
                }
            }
        }
        System.out.println(sb);
    }
}

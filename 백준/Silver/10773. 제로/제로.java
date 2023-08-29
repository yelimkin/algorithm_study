import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int case_num = Integer.parseInt(br.readLine());
        Stack<Integer> st = new Stack<Integer>();

        for(int i=0;i < case_num;i++) {
            int tmp = Integer.parseInt(br.readLine());
            if(!st.isEmpty() && tmp == 0) {
                st.pop();
            }else {
                st.push(tmp);
            }
        }

        int st_size = st.size();
        int sum = 0;
        for(int j=0;j < st_size;j++) {
            if(st.isEmpty()) break;
            sum += st.peek();
            st.pop();
        }

        System.out.println(sum);
    }
}

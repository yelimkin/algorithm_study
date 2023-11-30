import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    static Stack<String> st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str;
        while(!(str = br.readLine()).equals(".")) {
            // 문자열을 괄호만 남게하기 위한 처리
            str = str.replaceAll("[a-zA-Z_0-9]", "");
            str = str.replaceAll("[.]", "");
            str = str.replaceAll("[\\s]", "");

            // 각 문자열에 대한 스택 초기화
            st = new Stack<>();
            String[] pare = str.split("");
            sb.append(check(pare) + "\n");
        }

        System.out.println(sb);
    }

    static String check(String[] pare) {
        for(int i=0;i < pare.length;i++) {
            if(pare[i].equals("(") || pare[i].equals("[")) {
                st.push(pare[i]);
            }
            if(st.empty() && pare[i].equals(")")) {
                return "no";
            }else if(!st.empty() && pare[i].equals(")")) {
                if(!st.peek().equals("(")) {
                    return "no";
                }else {
                    st.pop();
                }
            }
            if(st.empty() && pare[i].equals("]")) {
                return "no";
            }else if(!st.empty() && pare[i].equals("]")) {
                if(!st.peek().equals("[")) {
                    return "no";
                }else {
                    st.pop();
                }
            }
        }
        if(st.empty()) {
            return "yes";
        }else {
            return "no";
        }
    }
}

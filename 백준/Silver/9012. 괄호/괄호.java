import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int case_num = Integer.parseInt(br.readLine());
        String [] str = new String[case_num];

        for(int i=0;i < case_num;i++) {
            str[i] = br.readLine();
        }

        for(int j=0;j < case_num;j++) {
            int cnt = 0;
            for(int k=0;k < str[j].length();k++) {
                if(cnt < 0) break;
                if(str[j].charAt(k) == '(') {
                    cnt++;
                }else if(str[j].charAt(k) == ')') {
                    cnt--;
                }
            }
            if(cnt == 0) {
                System.out.println("YES");
            }else if((cnt > 0) || (cnt < 0)){
                System.out.println("NO");
            }
        }
    }
}

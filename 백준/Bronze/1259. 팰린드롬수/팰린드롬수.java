import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main { // 펠린드롬 : 앞으로 읽으나 뒤로 읽으나 똑같은 단어
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str;
        while(!(str = br.readLine()).equals("0")) {
            int len = str.length();
            int mid = len / 2;
            boolean same = true;

            for(int i=0;i < mid;i++) {
                if(str.charAt(i) != str.charAt((len - 1) - i)) {
                    same = false;
                    break;
                }
            }
            System.out.println(same ? "yes" : "no");
        }
    }
}

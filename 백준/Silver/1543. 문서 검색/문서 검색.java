import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String dcm = br.readLine();
        String srch = br.readLine();

        int cnt = 0;
        int start = 0;
        while(start + srch.length() <= dcm.length()) {
            String check = dcm.substring(start, start + srch.length());
            if(check.equals(srch)) {
                cnt++;
                start += srch.length();
            }else {
                start += 1;
            }

        }

        System.out.println(cnt);
        br.close();
    }
}

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int cnt = 1;
        String str = "666";

        while(N > cnt) {
            int tmp = Integer.parseInt(str) + 1;
            str = String.valueOf(tmp);

            if(str.contains("666")) {
                cnt++;
            }
        }

        System.out.println(str);
    }
}

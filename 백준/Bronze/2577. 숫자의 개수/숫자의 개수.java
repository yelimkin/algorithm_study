import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long cal = 1;
        int [] num = new int[10];

        for(int i=0;i < 3;i++) {
            cal *= Integer.parseInt(br.readLine());
        }

        String [] str = String.valueOf(cal).split("");

        for(int i=0;i < str.length;i++) {
            int idx = Integer.parseInt(str[i]);
            num[idx] = ++num[idx];
        }

        for(int cnt : num) {
            System.out.println(cnt);
        }
    }
}
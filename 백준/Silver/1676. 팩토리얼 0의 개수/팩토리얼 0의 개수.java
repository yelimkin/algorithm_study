import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger; // 매우 큰 정수

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        BigInteger fact = fact(N);

        int cnt = 0;
        String check = String.valueOf(fact);
        for(int i = (check.length() - 1);i > -1;i--) {
            if(check.charAt(i) == '0') {
                cnt++;
            }else {
                break;
            }
        }

        System.out.println(cnt);
    }

    private static BigInteger fact(int n) {
        if(n == 0) return BigInteger.ONE; // 0! = 1
        if(n <= 1) {
            return BigInteger.valueOf(n);
        }else {
            return BigInteger.valueOf(n).multiply(fact(n - 1));
        }
    }
}

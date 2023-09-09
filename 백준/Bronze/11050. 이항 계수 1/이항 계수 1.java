import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        int N = Integer.parseInt(str[0]);
        int K = Integer.parseInt(str[1]);

        int answer = factorial(N) / (factorial(K) * factorial(N - K));
        System.out.println(answer);
    }

    private static int factorial(int n) {
        if(n == 0) return 1; // 0! = 1
        if(n <= 1) {
            return n;
        }else {
            return factorial(n - 1) * n;
        }
    }
}

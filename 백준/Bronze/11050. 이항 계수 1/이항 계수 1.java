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
        }else { // f(5) = 5 * f(4) = 5 * 4 * f(3) = 5 * 4 * 3 * f(2) = 5 * 4 * 3 * 2 * f(1) 
            // = 5 * 4 * 3 * 2 * 1 * f(0) =  5 * 4 * 3 * 2 * 1 * 1 = 120 
            return factorial(n - 1) * n;
        }
    }
}

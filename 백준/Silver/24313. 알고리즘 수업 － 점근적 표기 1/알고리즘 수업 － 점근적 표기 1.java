import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] a = br.readLine().split(" ");
        int a1 = Integer.parseInt(a[0]); // 7
        int a0 = Integer.parseInt(a[1]); // 7

        int c = Integer.parseInt(br.readLine()); // 8
        int n0 = Integer.parseInt(br.readLine()); // 1

        // O(g(n)) = {f(n) | 모든 n ≥ n0에 대하여 f(n) ≤ c × g(n)인 양의 상수 c와 n0가 존재한다}
        // f(n) = a1n + a0
        // 모든 n >= 1에 대해 7n + 7 <= 8 * g(n)인 양의 상수 c와 n0가 존재한다.
        // g(n) = n

        int fn = a1 * n0 + a0;
        int cgn = c * n0;

        if(fn <= cgn && a1 <= c) {
            System.out.println(1);
        }else {
            System.out.println(0);
        }
    }
}
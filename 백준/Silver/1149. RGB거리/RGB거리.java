import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[][] dp = new int[N + 1][3];
        String[] first = br.readLine().split(" ");
        dp[1][0] = Integer.parseInt(first[0]);
        dp[1][1] = Integer.parseInt(first[1]);
        dp[1][2] = Integer.parseInt(first[2]);

        for (int i = 2; i <= N; i++) {
            String[] input = br.readLine().split(" ");
            dp[i][0] = Integer.parseInt(input[0]);
            dp[i][1] = Integer.parseInt(input[1]);
            dp[i][2] = Integer.parseInt(input[2]);

            dp[i][0] += Math.min(dp[i - 1][1], dp[i - 1][2]);
            dp[i][1] += Math.min(dp[i - 1][0], dp[i - 1][2]);
            dp[i][2] += Math.min(dp[i - 1][0], dp[i - 1][1]);
        }

        System.out.println(Math.min(dp[N][0], Math.min(dp[N][1], dp[N][2])));
    }
}

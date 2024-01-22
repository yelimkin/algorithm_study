import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] nk = br.readLine().split(" ");
        // 물품 수 (1 <= N <= 100)
        int N = Integer.parseInt(nk[0]);
        // 무게 (1 <= K <= 100000)
        int K = Integer.parseInt(nk[1]);

        int[] weight = new int[N+1];
        int[] value = new int[N+1];

        for(int i=1;i <= N;i++) {
            String[] wv = br.readLine().split(" ");
            weight[i] = Integer.parseInt(wv[0]);
            value[i] = Integer.parseInt(wv[1]);
        }

        // dp[i][k] = i번째 물건끼지 더한 것에 대해 배낭의 무게 k일 때, 더한 최대 가치
        int[][] dp = new int[N+1][K+1];
        for(int j=1;j <= N;j++) {
            for(int k=1;k <= K;k++) {
                if(weight[j] > k) { // 담을 수 있는 무게보다 크다면
                    dp[j][k] = dp[j-1][k]; // 이전 가치를 가져오기
                }else { // 담을 수 있는 무게보다 작거나 같다면
                    dp[j][k] = Math.max(dp[j-1][k], dp[j-1][k - weight[j]] + value[j]);
                } // (이전 가치)와 (담을 수 있는 무게에서 뺀 무게의 가치를 더했을 때 가치)를 비교하여 최대 가치를 넣는다.
            }
        }

        System.out.println(dp[N][K]);
        br.close();
    }
}

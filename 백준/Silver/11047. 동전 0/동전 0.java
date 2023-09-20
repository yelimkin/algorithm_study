import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] money = br.readLine().split(" ");

        // 동전 종류
        int N = Integer.parseInt(money[0]);
        // 만들려는 금액
        int K = Integer.parseInt(money[1]);
        // 만들려는 금액 자릿수
        int o = money[1].length();

        int[] coin = new int[N];
        for(int i=0;i < N;i++) {
            String str = br.readLine();
            coin[i] = Integer.parseInt(str);
        }

        int cnt = 0;
        for(int j=(coin.length-1);j >= 0;j--) {
            if(coin[j] <= K) {
//                System.out.println(K /coin[j]);
                cnt += K /coin[j];
                K -= (K /coin[j]) * coin[j];
            }
            if(K < -1) {
                break;
            }
        }
        System.out.println(cnt);
    }
}

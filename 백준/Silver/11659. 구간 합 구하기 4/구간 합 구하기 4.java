import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main { // 구간 합 구하기4  -> 누적합
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = br.readLine().split(" ");
        StringBuilder sb = new StringBuilder();

        // 수의 개수
        int N = Integer.parseInt(nm[0]);
        // 합을 구해야 하는 횟수 - 테스트케이스
        int M = Integer.parseInt(nm[1]);

        String[] str = br.readLine().split(" ");
        // N개의 수 배열
        int[] num = new int[N+1];
        // 누적합 배열
        int[] prefix = new int[N+1];
        for(int i=1;i <= N;i++) {
           num[i] = Integer.parseInt(str[i-1]);
           prefix[i] = prefix[i-1] + num[i];
        }

        for(int j=0;j < M;j++) {
             String[] range = br.readLine().split(" ");
             int a = Integer.parseInt(range[0]);
             int b = Integer.parseInt(range[1]);

             sb.append(prefix[b] - prefix[a-1] + "\n");
        }

        System.out.println(sb);
    }
}

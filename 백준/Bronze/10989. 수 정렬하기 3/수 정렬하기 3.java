import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // Java11 시간 제한 : 3초, 메모리 제한 : 512MB
        // 정렬할 수의 범위는 10,000보다 작거나 같은 자연수
        // -> 이전 수 정렬하기 2 문제의 정렬 범위인 절댓값이 1,000,000보다 작거나 같은 정수보다 적은 범위
        int N = Integer.parseInt(br.readLine()); // 1 <= N <= 10,000,000

        // 계수 정렬
        // 누적합 배열의 값은 (시작점 - 1)을 알려준다.
        int[] arr = new int[N+1]; // int 4byte -> 4 X 10000001 = 40000004 -> 38.1469 MB
        int[] cnt = new int[10001]; // 4 X 10001 = 40004 -> 0.0038 MB

        for(int i=1;i <= N;i++) {
            int num = Integer.parseInt(br.readLine());
            arr[i] = num;
            cnt[num] += 1;
        }

        for(int j=1;j < cnt.length;j++) {
            while(cnt[j] > 0) {
                sb.append(j).append("\n");
                cnt[j]--;
            }
        }

        System.out.println(sb);
        br.close();
    }
}

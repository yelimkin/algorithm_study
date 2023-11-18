import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 주어진 정수
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];

        String[] nums = br.readLine().split(" ");
        for(int i=0;i < N;i++) {
            int num = Integer.parseInt(nums[i]);
            A[i] = num;
        }
        Arrays.sort(A);

        // 존재하는지 확인할 정수
        int M = Integer.parseInt(br.readLine());

        String[] check = br.readLine().split(" ");
        for(int j=0;j < M;j++) {
            int tmp = Integer.parseInt(check[j]);

            sb.append(findNum(tmp, A));
            sb.append("\n");
        }

        System.out.println(sb);
    }

    static int findNum(int tmp, int[] A) {
        int l = 0;
        int r = A.length - 1;

        while(l <= r) {
            int mid = (l + r) / 2;

            if(tmp == A[mid]) {
                return 1;
            }else if(tmp < A[mid]) {
                r = mid - 1;
            }else if(tmp > A[mid]) {
                l = mid + 1;
            }
        }

        return 0;
    }
}

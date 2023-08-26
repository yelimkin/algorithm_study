import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nums = br.readLine().split(" ");

        int a = Integer.parseInt(nums[0]);
        int b = Integer.parseInt(nums[1]);
        int m = 0;
        for(int i=1;i <= Math.min(a, b);i++) {
            if((a % i == 0) && (b % i == 0)) {
                m = i;
            }
        }

        System.out.println(m);
        System.out.println(m * (a / m) * (b / m));
    }
}
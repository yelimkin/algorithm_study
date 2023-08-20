import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int case_num = Integer.parseInt(br.readLine());
        int [] answer = new int[case_num];

        for(int i=0;i < case_num;i++) {
            String[] nums = br.readLine().split(" ");
            answer[i] = Integer.parseInt(nums[0]) + Integer.parseInt(nums[1]);
        }

        for(int ans : answer) {
            System.out.println(ans);
        }
    }
}
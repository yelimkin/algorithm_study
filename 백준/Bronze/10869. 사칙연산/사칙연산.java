import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nums = br.readLine().split(" ");

        System.out.println(Integer.parseInt(nums[0]) + Integer.parseInt(nums[1]));
        System.out.println(Integer.parseInt(nums[0]) - Integer.parseInt(nums[1]));
        System.out.println(Integer.parseInt(nums[0]) * Integer.parseInt(nums[1]));
        System.out.println(Integer.parseInt(nums[0]) / Integer.parseInt(nums[1]));
        System.out.println(Integer.parseInt(nums[0]) % Integer.parseInt(nums[1]));
    }
}
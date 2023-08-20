import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n_num = Integer.parseInt(br.readLine());
        String nums = br.readLine();

        int sum = 0;
        for(int i=0;i < n_num;i++) {
            sum += Integer.parseInt(Character.toString(nums.charAt(i)));
        }

        System.out.println(sum);
    }
}

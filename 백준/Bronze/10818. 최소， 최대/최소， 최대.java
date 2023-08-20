import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n_num = Integer.parseInt(br.readLine());
        String num_str = br.readLine();
        String[] num = num_str.split(" ");

        int max = -1000000;
        int min = 1000000;
        for(String n : num) {
            int val = Integer.parseInt(n);
            if(max < val) {
                max = val;
            }
            if(min > val) {
                min = val;
            }
        }

        System.out.println(min + " " + max);

    }
}

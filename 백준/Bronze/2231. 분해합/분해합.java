import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int answer = 0;

        for(int i=1;i < num;i++) {
            int n_sum = 0;
            int tmp = i;
            while(tmp > 0) {
                n_sum += tmp % 10;
                tmp = (tmp - tmp % 10) / 10;
            }
            if(n_sum + i == num) {
                answer = i;
                break;
            }
        }
        System.out.println(answer);
    }
}
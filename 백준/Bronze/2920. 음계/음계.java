import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] num = br.readLine().split(" ");
        int sum = 0;
        boolean mixed = false;

        for(int i=1;i < num.length;i++) {
            int dif = Integer.parseInt(num[i]) - Integer.parseInt(num[i - 1]);
            if((dif != 1) && (dif != -1)) {
                mixed = true;
                break;
            }
            sum += dif;

        }

        if(mixed) {
            System.out.println("mixed");
        }else if(sum == 7) {
            System.out.println("ascending");
        }else if(sum == -7) {
            System.out.println("descending");
        }
    }
}
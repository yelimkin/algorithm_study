import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] num_range  = br.readLine().split(" ");
        int start = Integer.parseInt(num_range[0]);
        int end = Integer.parseInt(num_range[1]);
        boolean[] prime = new boolean[end+1];
        for(int i=2;i <= end;i++) {
            prime[i] = true;
        }

        int root = (int)Math.sqrt(end);
        for(int i=2;i <= root;i++) {
            if(prime[i] == true) {
                for(int j=i;i * j <= end;j++) {
                    prime[i*j] = false;
                }
            }
        }

        for(int k=start;k <= end;k++) {
            if(prime[k] == true) System.out.println(k);
        }
    }
}

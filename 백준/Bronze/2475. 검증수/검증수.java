import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int sum = 0;

        while(st.hasMoreTokens()) {
            sum += Math.pow(Integer.valueOf(st.nextToken()), 2);
        }

        System.out.println(sum % 10);
    }
}
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sugar = Integer.parseInt(br.readLine());
        int answer = 0;

        for(int i=0;i <= sugar;i++) {
            for(int j=0;j <= sugar;j++) {
                if((5 * i) + (3 * j) == sugar) {
                    answer = i + j;
                    break;
                }
            }
        }

        answer = (answer == 0) ? -1 : answer;
        System.out.println((answer));
    }
}
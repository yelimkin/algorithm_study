import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.Stream;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] number = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int answer = 0;

        for(int i=0;i < number.length;i++) {
            int cnt = 0;
            for(int j=2;j <= number[i];j++) {
                if(number[i] % j == 0) cnt++;
            }
            if(cnt == 1) answer++;
        }

        System.out.println(answer);
    }
}

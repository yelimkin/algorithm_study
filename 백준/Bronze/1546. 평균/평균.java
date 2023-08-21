import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.Stream;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int [] score = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int max = 0;
        for(int sc : score) {
            if(max < sc) max = sc;
        }

        double [] answer = new double[num];
        for(int i=0;i < num;i++) {
            answer[i] = score[i] / (double) max * 100;
        }

        double sum = 0;
        for(int j=0;j < num;j++) {
            sum += answer[j];
        }
        System.out.println(sum / num);
    }
}
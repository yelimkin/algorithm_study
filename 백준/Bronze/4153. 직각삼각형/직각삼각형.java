import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.Stream;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            String str = br.readLine();
            if(str.equals("0 0 0")) break;
            int[] triangle = Stream.of(str.split(" ")).mapToInt(Integer::parseInt).toArray();
            Arrays.sort(triangle);

            if(Math.pow(triangle[0], 2) + Math.pow(triangle[1], 2) == Math.pow(triangle[2], 2)) {
                System.out.println("right");
            }else {
                System.out.println("wrong");
            }
        }
    }
}

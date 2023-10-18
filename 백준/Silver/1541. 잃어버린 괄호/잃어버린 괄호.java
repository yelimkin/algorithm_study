import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main { // 잃어버린 괄호
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 작은 수 - 큰 수 = 작은 수
        // 55 - (50 + 40) = -35
        // 덧셈으로 이루어진 부분을 먼저 계산한 뒤 빼주기
        // 덧셈 부분만 먼저 계산하기

        String str = br.readLine();
        // 연산자가 덧셈만 있는 문자열
        String[] plus = str.split("-");
//        System.out.println(Arrays.toString(plus));

        int sum = 0;
        if(plus[0].contains("+")) {
            int zSum = 0;
            String[] zTmp = plus[0].split("\\+");
            for(int j=0;j < zTmp.length;j++) {
                zSum += Integer.parseInt(zTmp[j]);
            }

            sum = zSum;
        }else {
            sum = Integer.parseInt(plus[0]);
        }

        for(int i=1;i < plus.length;i++) {
            if(plus[i].contains("+")) {
                int plusSum = 0;
                String[] tmp = plus[i].split("\\+");
                for(int j=0;j < tmp.length;j++) {
                    plusSum += Integer.parseInt(tmp[j]);
                }

                sum -= plusSum;
            }else {
                sum -= Integer.parseInt(plus[i]);
            }
        }

        System.out.println(sum);
    }
}

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] trinum = new int[1001];
        trinum[1] = 1;
        for(int i=2;i <= 1000;i++) {
            trinum[i] = trinum[i - 1] + i;
        }

        int T = Integer.parseInt(br.readLine());
        for(int j=0;j < T;j++) {
            boolean firstBreak = false;
            boolean secondBreak = false;
            int num = Integer.parseInt(br.readLine());
            for(int one=1;one < num;one++) {
                if(firstBreak) {
                    sb.append("1\n");
                    break;
                }
                for(int two=1;two < num;two++) {
                    if(secondBreak) break;
                    for(int thr=1;thr < num;thr++) {
                        if(num == trinum[one] + trinum[two] + trinum[thr]) {
                            firstBreak = true;
                            secondBreak = true;
                            break;
                        }
                    }
                }
            }
            if(!firstBreak) sb.append("0\n");
        }
        System.out.println(sb);
    }
}

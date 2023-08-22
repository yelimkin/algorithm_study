import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [] height = new int[9];
        int[] answer = new int [7];

        for(int i=0;i < 9;i++) {
            height[i] = Integer.parseInt(br.readLine());
        }

        for(int a=0;a < height.length;a++) {
            for(int b=a+1;b < height.length;b++) {
                for(int c=b+1;c < height.length;c++) {
                    for(int d=c+1;d < height.length;d++) {
                        for(int e=d+1;e < height.length;e++) {
                            for(int f=e+1;f < height.length;f++) {
                                for(int g=f+1;g < height.length;g++) {
                                    if(height[a] + height[b] + height[c] + height[d] + height[e] + height[f] + height[g] == 100) {
                                        int[] tmp = { height[a], height[b], height[c], height[d], height[e], height[f], height[g] };
                                        answer = tmp;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        Arrays.sort(answer);
        for(int ans : answer) {
            System.out.println(ans);
        }
    }
}

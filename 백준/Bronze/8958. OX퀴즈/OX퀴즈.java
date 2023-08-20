import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int case_num = Integer.parseInt(br.readLine());
        String[] correct = new String[case_num];
        int [] answer = new int[case_num];

        for(int i=0;i < case_num;i++) {
            correct[i] = br.readLine();
        }

        for(int i=0;i < correct.length;i++) {
            int tot_sum = 0;
            int sum = 0;
            for(int j=0;j < correct[i].length();j++) {
                if(correct[i].charAt(j) == 'O'){
                    sum++;
                    tot_sum += sum;
                }else if(correct[i].charAt(j) == 'X') {
                    sum = 0;
                }
            }
            answer[i] = tot_sum;
        }

        for(int ans : answer) {
            System.out.println(ans);
        }
    }
}
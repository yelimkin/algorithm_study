import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int case_num = Integer.parseInt(br.readLine());
        String [] answer = new String[case_num];

        for(int i=0;i < case_num;i++) {
            String[] room = br.readLine().split(" ");
            int w_num = 0;
            if(Integer.parseInt(room[2]) % Integer.parseInt(room[0]) == 0) {
                w_num = Integer.parseInt(room[2]) / Integer.parseInt(room[0]);
                answer[i] = room[0] + ((w_num > 9) ? w_num : "0" + w_num);
            }else {
                w_num = (Integer.parseInt(room[2]) / Integer.parseInt(room[0]) + 1);
                answer[i] = String.valueOf(Integer.parseInt(room[2]) % Integer.parseInt(room[0])) + ((w_num > 9) ? w_num : "0" + w_num);
            }
        }

        for(String ans : answer) {
            System.out.println(ans);
        }
    }
}

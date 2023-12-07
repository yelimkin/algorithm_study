import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 가진 카드 개수
        int N = Integer.parseInt(br.readLine());
        // 숫자 카드에 적힌 정수, 중복 없음
        String[] nums = br.readLine().split(" ");
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i < N;i++) {
            set.add(Integer.parseInt(nums[i]));
        }

        int M = Integer.parseInt(br.readLine());
        String[] num01 = br.readLine().split(" ");
        for(int j=0;j < M;j++) {
            if(set.contains(Integer.parseInt(num01[j]))) {
                sb.append("1 ");
            }else {
                sb.append("0 ");
            }
        }

        System.out.println(sb);
        br.close();
    }
}

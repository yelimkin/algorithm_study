import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        int K = Integer.parseInt(str[0]); // 현재 가진 랜선의 수 4
        int N = Integer.parseInt(str[1]); // 만들고 싶은 랜선의 총 개수 11

        long l = 0; long r = 1; // 랜선 길이 최소, 최대

        int[] line = new int[K];
        for(int i=0;i < K;i++) {
            line[i] = Integer.parseInt(br.readLine());
            if(r < line[i]) r = line[i]; // 랜선의 길이의 최대 길이 구하기
        }

        r++;

        // (11개가 나오는)개수가 중복이 될 때 최대 길이를 찾아야 한다는 것
        // 199cm, 200cm 둘다 랜선이 11개 나온다.
        while(l < r) {
            long mid = (l + r) / 2;

            long cnt = 0;
            for(int j=0;j < K;j++) {
                cnt += (line[j] / mid);
            }

//            if(cnt == N) {
//                System.out.println(mid);
//                break;
//            }

            if(cnt < N) { // 만들고 싶은 개수보다 적다면 더 많이 만들어야 하므로 최대를 줄이기
                r = mid;
            }else { // 만들고 싶은 개수보다 많다면 더 적게 만들어야 하므로 최소 늘리기
                l = mid + 1;
            }
        }
        System.out.println(l - 1);
    }
}

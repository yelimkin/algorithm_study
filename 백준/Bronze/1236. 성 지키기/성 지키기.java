import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] nm = br.readLine().split(" ");
        int N = Integer.parseInt(nm[0]);
        int M = Integer.parseInt(nm[1]);
        // 각 행의 경비병 존재 유무
        boolean[] row = new boolean[N];
        // 각 열의 경비병 존재 유무
        int[] col = new int[M];

        for(int i=0;i < N;i++) {
            String flr = br.readLine();
            if(flr.contains("X")) row[i] = true;
            for(int j=0;j < M;j++) {
                if(flr.charAt(j) == 'X') {
                    col[j] += 1;
                }
            }
        }

        int cnt = 0;
        // 행과 열 모두 경비병이 없는 경우를 세고
        // 경비병이 두고 이것도 배열에 반영
        for(int k=0;k < N;k++) {
            for(int l=0;l < M;l++) {
                if(!row[k] && col[l] == 0) {
                    row[k] = true;
                    col[l] += 1;
                    cnt++;
                }
            }
        }

        // 행과 열 모두 경비병이 없는 경우 외에도
        // 행만 보았을 때, 경비병이 없는 경우
        for(boolean r : row) {
            if(!r) cnt++;
        }

        // 행과 열 모두 경비병이 없는 경우 외에도
        // 열만 보았을 때, 경비병이 없는 경우
        for(int c : col) {
            if(c == 0) cnt++;
        }

        System.out.println(cnt);
        br.close();
    }
}

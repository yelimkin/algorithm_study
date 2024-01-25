import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // N : 표 크기, M : 합을 구하는 횟수
        String[] nm = br.readLine().split(" ");
        int N = Integer.parseInt(nm[0]);
        int M = Integer.parseInt(nm[1]);

        int[][] arr = new int[N+1][N+1];
        for(int i=1;i <= N;i++) {
            String[] input = br.readLine().split(" ");
            for(int j=1;j <= N;j++) { // 한 행의 0부터 누적합
                arr[i][j] = arr[i][j-1] + Integer.parseInt(input[j-1]);
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int k=0;k < M;k++) {
            String[] position = br.readLine().split(" ");

            int startX = Integer.parseInt(position[0]);
            int startY = Integer.parseInt(position[1]);

            int endX = Integer.parseInt(position[2]);
            int endY = Integer.parseInt(position[3]);

            int prefixSum = 0;
            for(int i=startX;i <= endX;i++) {
                prefixSum += (arr[i][endY] - arr[i][startY - 1]);
            }

            sb.append(prefixSum).append("\n");
        }

        System.out.println(sb);
        br.close();
    }
}

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 도시의 수
        int N = Integer.parseInt(br.readLine());

        // 두 도시를 연결하는 도로의 길이
        String[] km = br.readLine().split(" ");
        int[] road = new int[km.length];

        // 각 도시의 리터당 가격
        String[] l = br.readLine().split(" ");
        long[] city = new long[l.length - 1];

        for(int i=0;i < (N - 1);i++) {
            road[i] = Integer.parseInt(km[i]);
            city[i] = Long.parseLong(l[i]);
        }

        // 인덱스
        int j = 0;
        // 총 비용
        long sum = 0;
        // 계산할 도로 길이
        long totr = road[0]; 
        // 기준 도시
        long std = city[0]; 

        while(j < (N - 1)) { 
            if(j + 1 == N - 1) { 
                sum += std * totr; 
                break;
            }
            long c = city[j + 1];

            // 기준 도시보다 가격이 쌀 경우,
            if(std >= c) {
                sum += std * totr;
                j++;
                std = city[j];
                totr = road[j];
            }
            // 기준 도시보다 가격이 비쌀 경우,
            else if(std < c) {
                j++;
                totr += road[j];
            }
        }

        System.out.println(sum);
        br.close();
    }

}

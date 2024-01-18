import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    static int N;
    static int M;
    static HashMap<String, Integer> house;
    static ArrayList<int[]> chicken;
    static int[][] chickenPoint;
    static List<String> keys;
    static int answer = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // N×N 도시, M개의 치킨집
        // 2 <= N <= 50, 1 <= M(치킨 집) <= 13, 1 <= 집의 수 <= 2N
        // r행 c열
        String[] nm = br.readLine().split(" ");
        N = Integer.parseInt(nm[0]);
        M = Integer.parseInt(nm[1]);
        
        // 집 좌표
        house = new HashMap<>();
        // 치킨집 좌표
        chicken = new ArrayList<>();

        // 0은 빈 칸, 1은 집, 2는 치킨집
        for(int i=0;i < N;i++) {
            String[] input = br.readLine().split(" ");
            for(int j=0;j < N;j++) {
                int point = Integer.parseInt(input[j]);

                switch(point) {
                    case 1 :
                        house.put(new String(i + " " + j), Integer.MAX_VALUE);
                        break;
                    case 2 :
                        chicken.add(new int[] {i, j});
                        break;
                }
            }
        }

        // 최대 치킨집의 수 M개의 치킨집 좌표 넣는 배열
        chickenPoint = new int[M][2];
        keys = new ArrayList<>(house.keySet());

        // 치킨집을 중심으로 각 집과의 거리를 해시맵에 최소로 저장
        // !!! 최대 M개의 치킨집만 있을 때 !!!
        // 치킨집을 M만큼 선택하고 선택한 치킨집 좌표와의 거리 -> 최소 구하기
        chooseChicken(0, 0);

        System.out.println(answer);
        br.close();
    }

    static void chooseChicken(int start, int depth) {
        if(depth == M) {
            calculateDist(chickenPoint);
            return;
        }

        for(int i=start;i < chicken.size();i++) {
            chickenPoint[depth] = chicken.get(i);
            chooseChicken(i + 1, depth + 1);
        }
    }

    static void calculateDist(int[][] chickenPoint) {
        for(int[] arr : chickenPoint) {
            for(String k : keys) {
                String[] rc = k.split(" ");
                int r = Integer.parseInt(rc[0]);
                int c = Integer.parseInt(rc[1]);

                int distance = Math.abs(arr[0] - r) + Math.abs(arr[1] - c);

                if(house.get(k) > distance) {
                    house.put(k, distance);
                }
            }
        }

        int sum = 0;
        for(String k : keys) {
            sum += house.get(k);
        }
        answer = Math.min(answer, sum);
        resetMap();
    }

    static void resetMap() {
        for(String key : keys) {
            house.put(key, Integer.MAX_VALUE);
        }
    }
}

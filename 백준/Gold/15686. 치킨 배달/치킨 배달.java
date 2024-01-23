import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Point {
    int i;
    int j;

    Point(int i, int j) {
        this.i = i;
        this.j = j;
    }

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }
}

public class Main {
    static int N;
    static int M;
    static ArrayList<Point> house;
    static ArrayList<Point> chicken;
    static Point[] chickenPoint;
    static int answer = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // N×N 도시, M개의 치킨집
        // 2 <= N <= 50, 1 <= M(치킨 집) <= 13, 1 <= 집의 수 <= 2N
        // r행 c열
        String[] nm = br.readLine().split(" ");
        N = Integer.parseInt(nm[0]);
        M = Integer.parseInt(nm[1]);
        
        // <집 좌표, 치킨집과의 거리>
        // 해시맵은 탐색을 위해 쓰기..
        house = new ArrayList<>();
        // 치킨집 좌표
        chicken = new ArrayList<>();

        // 0은 빈 칸, 1은 집, 2는 치킨집
        for(int i=0;i < N;i++) {
            String[] input = br.readLine().split(" ");
            for(int j=0;j < N;j++) {
                int what = Integer.parseInt(input[j]);
                Point p = new Point(i, j);

                switch(what) {
                    case 1 :
                        house.add(p);
                        break;
                    case 2 :
                        chicken.add(p);
                        break;
                }
            }
        }

        // 최대 치킨집의 수 M개의 치킨집 좌표 넣는 배열
        chickenPoint = new Point[M];

        // 치킨집을 중심으로 각 집과의 거리를 해시맵에 최소로 저장
        // !!! 최대 M개의 치킨집만 있을 때 !!!
        // 치킨집을 M만큼 선택하고 선택한 치킨집 좌표와의 거리 -> 최소 구하기
        chooseChicken(0, 0);

        System.out.println(answer);
        br.close();
    }

    static void chooseChicken(int start, int depth) {
        if(depth == M) {
            calculateDist();
            return;
        }

        for(int i=start;i < chicken.size();i++) {
            chickenPoint[depth] = chicken.get(i);
            chooseChicken(i + 1, depth + 1);
        }
    }

    static void calculateDist() {
        int sum = 0;
        // 집과 선택된 치킨 집과의 거리 비교
        for(Point hp : house) {
            // 집 하나에 대해 치킨집과의 거리 중 최단 거리를 담을 변수
            int minDist = Integer.MAX_VALUE;
            for(Point cp : chickenPoint) {
                int distance = Math.abs(cp.getI() - hp.getI()) + Math.abs(cp.getJ() - hp.getJ());
                minDist = Math.min(minDist, distance);
            }
            sum += minDist;
        }

        answer = Math.min(answer, sum);
    }
}

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    static HashMap<Integer, Integer> map;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] ab = br.readLine().split(" ");
        int a = Integer.parseInt(ab[0]);
        int b = Integer.parseInt(ab[1]);

        map = new HashMap<>();
        // 공통 원소 구하기, 중복되는 것만 구하기
        int inter = 0;
        inter += checkMap(br.readLine(), a);
        inter += checkMap(br.readLine(), b);

        // 각 집합에서 공통된 원소 개수만 빼주기
        System.out.println((a - inter)+ (b - inter));
    }

    static int checkMap(String s, int size) { // 맵에 넣으면서 이미 존재한다면 일단 넣지 않고 개수만 세기
        int cnt = 0;
        String[] num = s.split(" ");

        for(int i=0;i < size;i++) {
            int elmt = Integer.parseInt(num[i]);

            if(!map.containsKey(elmt)) {
                map.put(elmt, 1);
            }else {
                cnt++;
            }
        }

        return cnt;
    }
}

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        HashMap<Integer, Integer> map = new HashMap<>();
        StringTokenizer nst = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            int tmp = Integer.parseInt(nst.nextToken());
            map.put(tmp, map.getOrDefault(tmp, 0) + 1);
        }

        int M = Integer.parseInt(br.readLine());
        int[] marr = new int[M];
        StringTokenizer mst = new StringTokenizer(br.readLine(), " ");
        for (int j = 0; j < M; j++) {
            marr[j] = Integer.parseInt(mst.nextToken());
        }

        // {2=1, 3=2, 6=1, 7=1, -10=2, 10=3}
        // [-10, 2, 3, 6, 7, 10]

        for (int m : marr) {
            if (map.containsKey(m)) {
                sb.append(map.get(m) + " ");
            } else {
                sb.append(0 + " ");
            }
        }

        System.out.println(sb);
    }
}

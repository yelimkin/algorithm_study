import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.ArrayList;

public class Main {
    static int N;
    static int M;
    static int[] arr;
    static int[] seq;
    static boolean[] check;
    static ArrayList<String> result;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // N개의 자연수 중에서 M개를 고른 수열
        // 중복되는 수열을 여러 번 출력 X
        String[] nm = br.readLine().split(" ");
        N = Integer.parseInt(nm[0]);
        M = Integer.parseInt(nm[1]);

        String[] input = br.readLine().split(" ");
        arr = new int[N];
        for(int i=0;i < N;i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(arr);

        seq = new int[M];
        check = new boolean[N];
        result = new ArrayList<>();

        nAndM(0);
        System.out.println(String.join("\n", result));
    }
    static void nAndM(int depth) {
        if(depth == M) {
            StringBuilder sb = new StringBuilder();
            for(int v : seq) {
                sb.append(v).append(" ");
            }
            if(!result.contains(sb.toString())) {
                result.add(sb.toString());
            }
            return;
        }

        for(int i=0;i < N;i++) { //
            if(!check[i]) {
                check[i] = true;
                seq[depth] = arr[i];
                nAndM(depth + 1);
                check[i] = false;
            }
        }
    }
}

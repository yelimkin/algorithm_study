import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        arr = new int[n];

        String[] input = br.readLine().split(" ");
        for(int i=0;i < n;i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        // 두 수를 합해서 만들어야 할 숫자
        int x = Integer.parseInt(br.readLine());

        int cnt = 0;
        for(int j=0;j < arr.length;j++) {
            if(arr[j] == 0) continue;
            int other = x - arr[j];
            cnt += check(j, other);
        }

        System.out.println(cnt);
    }

    static int check(int idx, int other) {
        for(int k=(idx + 1);k < arr.length;k++) {
            if(arr[k] == 0) continue;
            if(arr[k] == other) {
                arr[k] = arr[idx] = 0;
                return 1;
            }
        }
        return 0;
    }
}

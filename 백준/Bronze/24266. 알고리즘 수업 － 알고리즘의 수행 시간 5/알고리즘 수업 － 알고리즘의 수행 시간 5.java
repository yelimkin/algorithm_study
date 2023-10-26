import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 주어진 알고리즘은 첫번째 반복문에서 1 ~ n만큼 반복하고
        // 두번째 반복문에서도 1 ~ n만큼 반복, 세번째 반복문에서도 1 ~ n만큼 반복하여
        // 배열에 인덱스로 접근(O(1))하여 연산
        // -> O(N^3)
        long n = Long.parseLong(br.readLine());
        System.out.println(n * n * n);
        System.out.println(3);
    }
}

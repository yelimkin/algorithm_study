import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 주어진 알고리즘은 바깥 반복문에서 1 ~ n-1만큼 반복하고
        // 안쪽 반복문에서도 i+1 ~ n만큼 반복하여 배열에 인덱스로 접근(O(1))하여 연산
        // 차가 1인 등차수열만큼 수행 (2 ~ n 반복 -> 3 ~ n 반복 -> 4 ~ n 반복 -> ...)
        // -> O(N * (N - 1) / 2) ->  O(N^2)
        long n = Long.parseLong(br.readLine());
        System.out.println(n * (n - 1) / 2);
        System.out.println(2);
    }
}
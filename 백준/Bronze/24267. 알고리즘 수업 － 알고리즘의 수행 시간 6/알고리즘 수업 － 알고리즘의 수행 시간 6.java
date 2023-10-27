import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 주어진 알고리즘은 첫번째 반복문에서 1 ~ n-2만큼 반복하고
        // 두번째 반복문에서도 i+1 ~ n-1만큼 반복, 세번째 반복문에서도 j+1 ~ n만큼 반복하여
        // 배열에 인덱스로 접근(O(1))하여 연산
        // -> O(N^3)
        long n = Long.parseLong(br.readLine());

        // n = 7이라면
        // 첫번째 반복문에서 1~5 실행
        // 첫번째 반복문에서 1일 때, 두번째 반복문에서 2~6 실행
        // 첫번째 반복문이 1이고 두번째 반복문이 2일 때, 세번째 반복문에서 3~7 실행
        // 첫번째 반복문이 1이고 두번째 반복문이 3일 때, 세번째 반복문에서 4~7 실행
        // -> 1 ~ n 숫자중 3가지를 뽑아 중복없이 크기 순으로 작성하는 경우의 수가 수행 횟수
        // 조합 nC3으로 수행 횟수를 구할 수 있다.
        System.out.println((n * (n-1) * (n-2)) / 6);
        System.out.println(3);
    }
}

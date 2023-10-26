import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 주어진 알고리즘은 입력 크기에 따라 1 ~ n까지 반복하면서
        // 배열에 인덱스(O(1))로 값을 가져와 연산
        // 입력 크기만큼 연산 -> O(N)
        // 최고차항만 표기하므로 이 알고리즘은 O(N)
        int n = Integer.parseInt(br.readLine());
        System.out.println(n);
        System.out.println(1);
    }
}
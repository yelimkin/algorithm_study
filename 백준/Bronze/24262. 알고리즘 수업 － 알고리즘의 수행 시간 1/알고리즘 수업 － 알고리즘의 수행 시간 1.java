import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 문제의 알고리즘과 같이 
        // (/, 내림)연산을 하고 배열에서 인덱스를 통해 값을 찾아 반환(O(1)) 경우,
        // O(1)
        // -> 데이터가 증가하여도 n이 증가해도 연산 횟수는 변하지 않기 때문이다.
        int n = Integer.parseInt(br.readLine());
        
        System.out.println(1);
        System.out.println(0);
    }
}
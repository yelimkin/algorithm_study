import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main { // 요세푸스 문제 0
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        int N = Integer.parseInt(str[0]); // 사람 수 (1번 ~ N번)
        int K = Integer.parseInt(str[1]); // 제거할 K번째 사람

        LinkedList<Integer> list = new LinkedList<>();

        for(int i=1;i <= N;i++) { // 1 2 3 4 5 6 7
            list.add(i);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");

        int idx = 0; // 리스트에서 삭제할 요소를 참조할 인덱스 변수

        while(N > 1) { // 7 6 5 4 3 2 1 0
            // idx = (0 + (3 - 1)) % 7 = 2 % 7 = 2
            // idx = (2 + (3 - 1)) % 6 = 4 % 6 = 4
            // idx = (4 + (3 - 1)) % 5 = 6 % 5 = 1
            // idx = (1 + (3 - 1)) % 4 = 3 % 4 = 3
            // idx = (3 + (3 - 1)) % 3 = 5 % 3 = 2
            // idx = (2 + (3 - 1)) % 2 = 4 % 2 = 0
            // idx = (0 + (3 - 1)) % 1 = 2 % 1 = 0
            // N이 7이면 모든 수는 7로 나누었을 때 0~6의 나머지만 나오므로 인덱스를 구하기 쉽다.
            idx = (idx + (K - 1)) % N; // 인덱스를 증가시키면서 삭제

            sb.append(list.remove(idx)).append(", ");
            // 1 2 4 5 6 7
            // 1 2 4 5 7
            // 1 4 5 7
            // 1 4 5
            // 1 4
            // 4
            //
            N--; // 사람 한명 제거했으니 사람 수 감소
        }

        // 마지막으로 남은 요소를 삭제함
        sb.append(list.remove()).append(">");
        System.out.println(sb);
    }

}

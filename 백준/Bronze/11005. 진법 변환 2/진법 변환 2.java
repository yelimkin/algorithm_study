import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        String[] nb = br.readLine().split(" ");

        // 10진법 수 N (1 <= N <= 100000000000)
        int N = Integer.parseInt(nb[0]);
        // 변환할 B진법 (2 <= B <= 36)
        // A : 10, B : 11, C : 12, ..., Y : 34, Z : 35
        int B = Integer.parseInt(nb[1]);
        HashMap<Integer, String> alpha = new HashMap<>() {{
            put(10, "A"); put(11, "B"); put(12, "C"); put(13, "D"); put(14, "E"); put(15, "F"); put(16, "G"); put(17, "H"); put(18, "I"); put(19, "J");
            put(20, "K"); put(21, "L"); put(22, "M"); put(23, "N"); put(24, "O"); put(25, "P"); put(26, "Q"); put(27, "R"); put(28, "S"); put(29, "T");
            put(30, "U"); put(31, "V"); put(32, "W"); put(33, "X"); put(34, "Y"); put(35, "Z");
        }};

        while(N != 0) {
            int rest = N % B;
            sb.append(rest > 9 ? alpha.get(rest) : rest);
            N = N / B;
        }

        System.out.println(sb.reverse());
    }
}

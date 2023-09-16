import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<>(){{
            put("a", 1);
            put("b", 2);
            put("c", 3);
            put("d", 4);
            put("e", 5);
            put("f", 6);
            put("g", 7);
            put("h", 8);
            put("i", 9);
            put("j", 10);
            put("k", 11);
            put("l", 12);
            put("m", 13);
            put("n", 14);
            put("o", 15);
            put("p", 16);
            put("q", 17);
            put("r", 18);
            put("s", 19);
            put("t", 20);
            put("u", 21);
            put("v", 22);
            put("w", 23);
            put("x", 24);
            put("y", 25);
            put("z", 26);
        }};

        int len = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split("");

        int sum = 0;
        for(int i=0;i < len;i++) {
            sum += map.get(str[i]) * (int)Math.pow(31, i);
        }

        System.out.println(sum);

    }
}

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toUpperCase();

        HashMap<Character, Integer> map = new HashMap<Character, Integer>(){{
            for(int i=0;i < str.length();i++) {
                put(str.charAt(i), getOrDefault(str.charAt(i), 0) + 1);
            }
        }};

        Integer maxValue = Collections.max(map.values());

        StringBuilder sb = new StringBuilder();
        for(Character k : map.keySet()) {
            if(map.get(k).equals(maxValue)) {
                sb.append(k);
            }
        }

        if(sb.length() > 1) {
            System.out.println("?");
        }else {
            System.out.println(sb.toString());
        }
    }

}
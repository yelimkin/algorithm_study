import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String [] alpha = {"-1", "-1", "-1", "-1", "-1", "-1", "-1", "-1", "-1", "-1", "-1", "-1", "-1", "-1", "-1", "-1", "-1", "-1", "-1", "-1", "-1", "-1", "-1", "-1", "-1", "-1"};

        HashMap<Character, Integer> map = new HashMap<Character, Integer>(){{
            put('a', 0);
            put('b', 1);
            put('c', 2);
            put('d', 3);
            put('e', 4);
            put('f', 5);
            put('g', 6);
            put('h', 7);
            put('i', 8);
            put('j', 9);
            put('k', 10);
            put('l', 11);
            put('m', 12);
            put('n', 13);
            put('o', 14);
            put('p', 15);
            put('q', 16);
            put('r', 17);
            put('s', 18);
            put('t', 19);
            put('u', 20);
            put('v', 21);
            put('w', 22);
            put('x', 23);
            put('y', 24);
            put('z', 25);

        }};

        for(int i=0;i < str.length();i++) {
            if(alpha[map.get(str.charAt(i))].equals("-1")) {
                alpha[map.get(str.charAt(i))] = String.valueOf(i);
            }
        }
        
        System.out.println(String.join(" ", alpha));
    }

}
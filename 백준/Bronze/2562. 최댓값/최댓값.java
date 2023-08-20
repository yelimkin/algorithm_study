import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i < 9;i++) {
            list.add(Integer.valueOf(br.readLine()));
        }

        System.out.println(Collections.max(list));
        System.out.println(list.indexOf(Collections.max(list)) + 1);
    }

}

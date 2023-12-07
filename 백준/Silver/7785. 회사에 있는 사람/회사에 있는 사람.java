import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        // 동명이인 X, 대소문자가 달라도 다른 이름
        HashSet<String> set = new HashSet<>();
        for(int i=0;i < n;i++) {
            String[] log = br.readLine().split(" ");
            if(log[1].equals("enter")) {
                set.add(log[0]);
            }else {
                set.remove(log[0]);
            }
        }

        List<String> lst = new ArrayList<>(set);
        Collections.sort(lst, Collections.reverseOrder());
        for(String name : lst) {
            bw.write(name);
            bw.newLine();
        }
        br.close();
        bw.close();
    }
}

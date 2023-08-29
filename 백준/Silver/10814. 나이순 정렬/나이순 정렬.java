import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int case_num = Integer.parseInt(br.readLine());
        HashMap<Integer, ArrayList<String>> map = new HashMap<>();

        for(int i=0;i < case_num;i++) {
            String[] tmp = br.readLine().split(" ");
            ArrayList<String> arr = new ArrayList<>();
            arr.add(tmp[1]);

            if(map.containsKey(Integer.parseInt(tmp[0]))) {
                map.get(Integer.parseInt(tmp[0])).add(tmp[1]);
            }else {
                map.put(Integer.parseInt(tmp[0]), arr);
            }
        }

        // {20=[Sunyoung], 21=[Junkyu, Dohyun]}
        List<Integer> keySet = new ArrayList<>(map.keySet());
        Collections.sort(keySet);

        for(int k=0;k < keySet.size();k++) {
            int key = keySet.get(k);
            ArrayList<String> value = map.get(key);
            for(int l=0;l < value.size();l++) {
                System.out.println(key + " " + value.get(l));
            }
        }
    }

}

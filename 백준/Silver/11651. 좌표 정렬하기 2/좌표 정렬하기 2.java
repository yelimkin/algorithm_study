import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Main { // 좌표를 y좌표가 증가하는 순으로, y좌표가 같으면 x좌표가 증가하는 순서
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

        for(int i=0;i < N;i++) {
            String[] str = br.readLine().split(" ");
            int x = Integer.parseInt(str[0]);
            int y = Integer.parseInt(str[1]);
            if(map.containsKey(y)) {
                map.get(y).add(x);
            }else {
                ArrayList<Integer> tmp = new ArrayList<>();
                tmp.add(x);
                map.put(y, tmp);
            }
        }

        List<Integer> keySet = new ArrayList<>(map.keySet());
        Collections.sort(keySet);

        for(int j=0;j < keySet.size();j++) {
            int y = keySet.get(j);
            ArrayList<Integer> xlst = map.get(y);
            Collections.sort(xlst);
            for(int k=0;k < xlst.size();k++) {
                System.out.println(xlst.get(k) + " " + y);
            }
        }
    }

}

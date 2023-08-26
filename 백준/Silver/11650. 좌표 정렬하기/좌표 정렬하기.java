import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int case_num = Integer.parseInt(br.readLine());
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

        for(int i=0;i < case_num;i++) {
            String[] point = br.readLine().split(" ");
            int x = Integer.parseInt(point[0]);
            int y = Integer.parseInt(point[1]);

            if(map.keySet().contains(x)) {
                map.get(x).add(y);
            }else {
                ArrayList<Integer> tmp = new ArrayList<>();
                tmp.add(y);
                map.put(x, tmp);
            }
        }

        List<Integer> keySet = new ArrayList<>(map.keySet());
        Collections.sort(keySet);

        for(int k : keySet) {
            ArrayList<Integer> list = map.get(k);
            Collections.sort(list);
            for(int j=0;j < list.size();j++) {
                System.out.println(k + " " +list.get(j));
            }
        }

    }
}

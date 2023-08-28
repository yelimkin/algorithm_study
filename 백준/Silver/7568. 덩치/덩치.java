import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();
        int case_num = Integer.parseInt(br.readLine());

        for(int i=0;i < case_num;i++) {
            String[] mkg = br.readLine().split(" ");
            ArrayList<Integer> tmp = new ArrayList<>();
            tmp.add(Integer.parseInt(mkg[0]));
            tmp.add(Integer.parseInt(mkg[1]));
            map.put(i, tmp);
        }

        // {0=[55, 185], 1=[58, 183], 2=[88, 186], 3=[60, 175], 4=[46, 155]}

        for(int j=0;j < map.size();j++) {
            int cnt = 0;
            for(int k=0;k < map.size();k++) {
                if(j == k) continue;
                if((map.get(j).get(0) < map.get(k).get(0)) && (map.get(j).get(1) < map.get(k).get(1))) {
                    cnt++;
                }
            }
            System.out.print((cnt + 1) + " ");

        }
    }
}

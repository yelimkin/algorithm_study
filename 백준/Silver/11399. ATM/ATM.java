import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Integer, Integer> map = new HashMap<>();
        int N = Integer.parseInt(br.readLine());
        String[] time = br.readLine().split(" ");

        for(int i=0;i < N;i++) {
            map.put(i+1, Integer.parseInt(time[i]));
        }

//        System.out.println(map);

        List<Integer> keySet = new ArrayList<>(map.keySet());
        keySet.sort((o1, o2) -> map.get(o1).compareTo(map.get(o2)));

//        System.out.println(keySet);
        int sum = 0;
        int total = 0;
        for(int k : keySet) {
            sum += map.get(k);
//            System.out.println("sum : " + sum);
            total += sum;
        }

        System.out.println(total);
    }
}

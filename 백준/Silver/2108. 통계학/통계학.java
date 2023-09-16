import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Main { // 최빈값은 여러개 있을 때 최빈값 중 두번째로 작은 값 출력 -> 동일한 최빈값이 있다면 두번째로 작은 값 출력
    public static void main(String[] arsg) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int [] number = new int[N];
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;

        for(int i=0;i < N;i++) {
            number[i] = Integer.parseInt(br.readLine());
            sum += number[i];
            map.put(number[i], map.getOrDefault(number[i], 0) + 1);
        }

        Arrays.sort(number);
//        System.out.println(map);
        List<Integer> keySet = new ArrayList<>(map.keySet());
        keySet.sort((o1, o2) -> map.get(o2).compareTo(map.get(o1)));
//        System.out.println(keySet);
        int maxKey  = keySet.get(0);
//        System.out.println("maxKey : " + maxKey);
        ArrayList<Integer> same = new ArrayList<>();
        same.add(maxKey);
        for(int j=1;j < keySet.size();j++) {
//            System.out.println("j : " + map.get(keySet.get(j)));
            if(map.get(maxKey) == map.get(keySet.get(j))) {
                same.add(keySet.get(j));
//                System.out.println("maxKey : " + maxKey);
            }
        }
        Collections.sort(same);
//        System.out.println("same : " + same);

        int mid = (number.length - 1) / 2;

        System.out.println(Math.round(sum / (float)N));
        System.out.println(number[mid]);
        System.out.println(same.size() > 1 ? same.get(1) : maxKey);
        System.out.println(number[number.length - 1] - number[0]);

    }

}

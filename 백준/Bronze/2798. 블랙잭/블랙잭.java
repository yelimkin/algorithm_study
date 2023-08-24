import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.Stream;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] blackJack = br.readLine().split(" ");
        int[] card = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0;i < card.length;i++) {
            for(int j = i+1;j < card.length;j++) {
                for(int k = j+1;k < card.length;k++) {
                    int sum = card[i] + card[j] + card[k];
                    if(Integer.parseInt(blackJack[1]) - sum >= 0) {
                        map.put(sum, Integer.parseInt(blackJack[1]) - sum);
                    }
                }
            }
        }

        List<Integer> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys, (v1, v2) -> (map.get(v1).compareTo(map.get(v2))));

        System.out.println(keys.get(0));
    }
}
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int case_num = Integer.parseInt(br.readLine());
        HashMap<Integer, HashSet<String>> map = new HashMap<>();
        for(int i=0;i < case_num;i++) {
            String word = br.readLine();
            Integer word_len = word.length();
            HashSet<String> tmp = new HashSet<>();
            tmp.add(word);

            if(map.keySet().contains(word_len)) {
                map.get(word_len).add(word);
            }else {
                map.put(word_len, tmp);
            }
        }

        List<Integer> keySet = new ArrayList<>(map.keySet());
        Collections.sort(keySet);

        for(Integer k : keySet) {
            HashSet<String> v_sort = map.get(k);
            v_sort.stream().sorted().forEach(System.out::println);
        }
    }
}

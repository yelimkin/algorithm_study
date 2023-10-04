import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = br.readLine().split(" ");

        // 듣도 못한 사람 수 N
        int N = Integer.parseInt(nm[0]);
        // 보도 못한 사람 수 M
        int M = Integer.parseInt(nm[1]);

        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0;i < N+M;i++) {
            String name = br.readLine();
            map.put(name, map.getOrDefault(name, 0) + 1);
        }

//        System.out.println(map);

        List<String> lst = new ArrayList<>(map.keySet());
        List<String> answer = new ArrayList<>();
        for(int j=0;j < lst.size();j++) {
            if(map.get(lst.get(j)) == 2) {
                answer.add(lst.get(j));
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(answer.size() + "\n");
        Collections.sort(answer);
        for(int k=0;k < answer.size();k++) {
            sb.append(answer.get(k) + "\n");
        }
        System.out.println(sb);
    }
}

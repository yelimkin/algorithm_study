import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Arrays;

public class Main { // 집합
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int M = Integer.parseInt(br.readLine());
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i < M;i++) {
            String[] str = br.readLine().split(" ");

            if(str[0].contains("add")) {
                set.add(Integer.parseInt(str[1]));
            }else if(str[0].contains("remove")) {
                set.remove(Integer.parseInt(str[1]));

            }else if(str[0].contains("check")) {
                int tmp = Integer.parseInt(str[1]);
                if(set.contains(tmp)) {
                    sb.append(1 + "\n");
                }else {
                    sb.append(0 + "\n");
                }

            }else if(str[0].contains("toggle")) {
                int tmp = Integer.parseInt(str[1]);
                if(set.contains(tmp)) {
                    set.remove(tmp);
                }else {
                    set.add(tmp);
                }

            }else if(str[0].contains("all")) {
                set = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20));

            }else if(str[0].contains("empty")) {
                set.clear();

            }
        }

        System.out.println(sb);
    }
}

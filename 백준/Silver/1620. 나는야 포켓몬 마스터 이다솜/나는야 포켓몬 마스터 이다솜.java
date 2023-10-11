import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = br.readLine().split(" ");

        // 포켓몬 개수
        int N = Integer.parseInt(nm[0]);
        // 문제 개수
        int M = Integer.parseInt(nm[1]);

        // 포켓몬 이름 맨앞만 아님 맨뒤만 대문자, 이름 길이는 2 ~ 20
        HashMap<String, Integer> name = new HashMap<>();
        HashMap<Integer, String> number = new HashMap<>();
        for(int i=0;i < N;i++) {
            String str = br.readLine();
            name.put(str, i+1);
            number.put(i+1, str);
        }
        
//        System.out.println(name);
//        System.out.println(number);

        for(int j=0;j < M;j++) {
            String problem = br.readLine();
            // 문제가 숫자인지
            if(problem.matches("[-+]?\\d*\\.?\\d+")) {
                System.out.println(number.get(Integer.parseInt(problem)));
            }else {
                System.out.println(name.get(problem));
            }
        }
    }
}

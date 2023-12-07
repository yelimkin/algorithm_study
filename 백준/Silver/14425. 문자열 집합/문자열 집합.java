import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] nm = br.readLine().split(" ");
        int N = Integer.parseInt(nm[0]);
        HashSet<String> set = new HashSet<>();
        for(int  i=0;i < N;i++) {
            set.add(br.readLine());
        }

        int M = Integer.parseInt(nm[1]);
        int cnt = 0;
        for(int j=0;j < M;j++) {
            if(set.contains(br.readLine())) {
                cnt++;
            }
        }

        System.out.println(cnt);
        br.close();
    }
}

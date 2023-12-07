import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] now = br.readLine().split(":");
        String[] salt = br.readLine().split(":");

        // 다 초로 만들어 버리기
        int nowhour = Integer.parseInt(now[0]) * 60 * 60;
        int nowmin = Integer.parseInt(now[1]) * 60;
        int nowsec = Integer.parseInt(now[2]);
        int nowtime  = nowhour + nowmin + nowsec;

        int salthour = Integer.parseInt(salt[0]) * 60 * 60;
        int saltmin = Integer.parseInt(salt[1]) * 60;
        int saltsec = Integer.parseInt(salt[2]);
        int salttime = salthour + saltmin + saltsec;

        int dif = (salttime - nowtime <= 0) ? (salttime - nowtime) + (24 * 60 * 60) : salttime - nowtime;
        System.out.println(calculate(dif));
        br.close();
    }

    static String calculate(int dif) {
        int reshour = dif / 3600;
        int resmin = (dif % 3600) / 60;
        int ressec = dif % 60;

        return String.format("%02d:%02d:%02d", reshour, resmin, ressec);
    }
}

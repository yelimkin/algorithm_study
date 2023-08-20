import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String time = br.readLine();
        String[] hm = time.split(" ");

        int minute = (Integer.parseInt(hm[0]) * 60) + Integer.parseInt(hm[1]);

        if(minute < 45) {
            hm[0] = "23";
            hm[1] = String.valueOf(60 - (45 - minute));
        }else {
            hm[0] = String.valueOf((minute - 45) / 60);
            hm[1] = String.valueOf((minute - 45) % 60);
        }

        System.out.println(String.join(" ", hm));
    }
}
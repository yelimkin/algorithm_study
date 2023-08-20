import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int case_num = Integer.parseInt(br.readLine());

        for(int i=0;i < case_num;i++) {
            String[] rep = br.readLine().split(" ");

            for(int j=0;j < rep[1].length();j++) {
                System.out.print(Character.toString(rep[1].charAt(j)).repeat(Integer.parseInt(rep[0])));
            }
            System.out.println();
        }
    }
}
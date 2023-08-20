import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] num = br.readLine().split(" ");

        if(Integer.parseInt(num[0]) > Integer.parseInt(num[1])) {
            System.out.println(">");
        }else if(Integer.parseInt(num[0]) < Integer.parseInt(num[1])) {
            System.out.println("<");
        }else if(Integer.parseInt(num[0]) == Integer.parseInt(num[1])) {
            System.out.println("==");
        }

    }
}
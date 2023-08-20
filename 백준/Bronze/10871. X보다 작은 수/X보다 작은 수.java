import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nx = br.readLine().split(" ");
        String[] nums = br.readLine().split(" ");

        List<String> list = new ArrayList<>();
        for(String n : nums) {
            if(Integer.parseInt(n) < Integer.parseInt(nx[1])) list.add(n);
        }

        System.out.println(String.join(" ", list));
    }
}
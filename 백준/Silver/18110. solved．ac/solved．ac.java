import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int case_num = Integer.parseInt(br.readLine());

        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i < case_num;i++){
            list.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(list);

        int rmv = (int) Math.round(list.size() * 0.15);
//        System.out.println("rmv : " + rmv);
        int sum = 0;
        int cnt = 0;
        for(int j=rmv;j < (list.size() - rmv);j++) {
            sum += list.get(j);
            cnt++;
        }
//        System.out.println("sum : " + sum);
//        System.out.println("cnt : " + cnt);

//        System.out.println((int) Math.round(list.stream().reduce(0, Integer::sum) / (double) list.size()));
        System.out.println(Math.round((double)sum / cnt));
    }
}

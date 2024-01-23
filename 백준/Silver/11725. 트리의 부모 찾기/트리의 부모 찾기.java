import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        ArrayList<ArrayList<Integer>> t = new ArrayList<>();
        // 트리의 루트 노드는 1번 노드
        for(int i=0;i <= N;i++) {
            t.add(new ArrayList<>());
        }

        boolean[] check = new boolean[N+1];
        int[] answer = new int[N+1];

        for(int i=1;i < N;i++) {
            String[] input = br.readLine().split(" ");

            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);

            t.get(a).add(b);
            t.get(b).add(a);
        }

        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        while(!q.isEmpty()) {
            int tmp = q.poll();
            ArrayList<Integer> node = t.get(tmp);

            if(!check[tmp]) {
                for(Integer num : node) {
                    if(!check[num]) {
                        answer[num] = tmp;
                        q.add(num);
                    }
                }
                check[tmp] = true;
            }
        }

        for(int k=2;k < answer.length;k++) {
            sb.append(answer[k]).append("\n");
        }

        System.out.println(sb);
        br.close();
    }
}

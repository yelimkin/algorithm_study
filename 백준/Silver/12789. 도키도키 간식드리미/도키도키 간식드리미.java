import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
    static Stack<Integer> st;
    static Queue<Integer> line;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 앞에 서 있는 학생 수
        int N = Integer.parseInt(br.readLine());
        // 번호표 1 ~ N
        int seq = 1;
        st = new Stack<>();

        String[] str = br.readLine().split(" ");
        line = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            line.offer(Integer.parseInt(str[i]));
        }

        // 간식 받는 곳에
        // 줄 서는 곳에 있던 사람, 한 명씩만 설 수 있는 공간에 있던 사람이 갈지
        // 맞는 번호표가 있는 사람이 간식 받는 곳에 가야 한다.
        // 맞는 번호표를 가진 사람이 줄 서는 곳에 있는지, 한 명씩만 설 수 있는 공간에 있는지
        while (!line.isEmpty()) {
            // 줄 서는 곳에 번호표를 가진 사람이 있다면
            if (line.contains(seq) && seq == line.peek()) {
                line.poll();
                seq++;
                continue;
            }
            // 한 명씩만 설 수 있는 공간에 번호표를 가진 사람이 있다면
            if (st.contains(seq) && seq == st.peek()) {
                st.pop();
                seq++;
                continue;
            }
            // 줄 서는 곳, 한 명씩만 설 수 있는 공간 모두 번호표를 가진 사람이 없다면
            st.push(line.poll());
        }

        while(st.contains(seq) && seq == st.peek()) {
            st.pop();
            seq++;
        }

        if(!st.isEmpty()) {
            System.out.println("Sad");
        }else {
            System.out.println("Nice");
        }
    }
}

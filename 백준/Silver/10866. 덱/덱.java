import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> dq = new ArrayList<>();
        int N = Integer.parseInt(br.readLine());

        for(int i=0;i < N;i++) {
            String[] str = br.readLine().split(" ");

            if(str[0].contains("push_front")) {
                push_front(dq, Integer.parseInt(str[1]));
            }else if(str[0].contains("push_back")) {
                push_back(dq, Integer.parseInt(str[1]));
            }else if(str[0].contains("pop_front")) {
                pop_front(dq);
            }else if(str[0].contains("pop_back")) {
                pop_back(dq);
            }else if(str[0].contains("size")) {
                deque_size(dq);
            }else if(str[0].contains("empty")) {
                deque_empty(dq);
            }else if(str[0].contains("front")) {
                deque_front(dq);
            }else if(str[0].contains("back")) {
                deque_back(dq);
            }
        }

    }

    private static void push_front(ArrayList dq, int x) {
        dq.add(0, x);
    }

    private static void push_back(ArrayList dq, int x) {
        dq.add(x);
    }

    private static void pop_front(ArrayList dq) {
        if(dq.isEmpty()) {
            System.out.println(-1);
        }else {
            System.out.println(dq.get(0));
            dq.remove(0);
        }
    }

    private static void pop_back(ArrayList dq) {
        if(dq.isEmpty()) {
            System.out.println(-1);
        }else {
            System.out.println(dq.get(dq.size() - 1));
            dq.remove(dq.size() - 1);
        }
    }

    private static void deque_size(ArrayList dq) {
        System.out.println(dq.size());
    }

    private static void deque_empty(ArrayList dq) {
        if(dq.isEmpty()) {
            System.out.println(1);
        }else {
            System.out.println(0);
        }
    }

    private static void deque_front(ArrayList dq) {
        if(dq.isEmpty()) {
            System.out.println(-1);
        }else {
            System.out.println(dq.get(0));
        }
    }

    private static void deque_back(ArrayList dq) {
        if(dq.isEmpty()) {
            System.out.println(-1);
        }else {
            System.out.println(dq.get(dq.size() - 1));
        }
    }
}

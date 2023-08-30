import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    static void pushQ(ArrayList queue, int x) {
        queue.add(x);
    }

    static void popQ(ArrayList queue) {
        if(queue.isEmpty()) {
            System.out.println(-1);
        }else {
            System.out.println(queue.get(0));
            queue.remove(0);
        }
    }

    static void sizeQ(ArrayList queue) {
        System.out.println(queue.size());
    }

    static void emptyQ(ArrayList queue) {
        if(queue.size() == 0) {
            System.out.println(1);
        }else {
            System.out.println(0);
        }
    }

    static void frontQ(ArrayList queue) {
        if(queue.isEmpty()) {
            System.out.println(-1);
        }else {
            System.out.println(queue.get(0));
        }
    }

    static void backQ(ArrayList queue) {
        if(queue.size() == 0) {
            System.out.println(-1);
        }else {
            System.out.println(queue.get(queue.size() - 1));
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int case_num = Integer.parseInt(br.readLine());
        ArrayList<Integer> queue = new ArrayList<>();

        for(int i=0;i < case_num;i++) {
            String str = br.readLine();
            if(str.contains("push")) {
                String[] num = str.split(" ");
                pushQ(queue, Integer.parseInt(num[1]));
            }else if(str.contains("pop")) {
                popQ(queue);
            }else if(str.contains("size")) {
                sizeQ(queue);
            }else if(str.contains("empty")) {
                emptyQ(queue);
            }else if(str.contains("front")) {
                frontQ(queue);
            }else if(str.contains("back")) {
                backQ(queue);
            }
        }

    }
}
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Main {
    static void pushX(ArrayList<Integer> stack, String str) {
        String[] tmp = str.split(" ");
        stack.add(Integer.parseInt(tmp[1]));
    }

    static void popX(ArrayList<Integer> stack) {
        if(stack.size() == 0) {
            System.out.println(-1);
        }else {
            System.out.println(stack.get(stack.size() - 1));
            stack.remove(stack.size() - 1);
        }
    }

    static void emptyX(ArrayList<Integer> stack) {
        if(stack.size() == 0) {
            System.out.println(1);
        }else {
            System.out.println(0);
        }
    }

    static void sizeX(ArrayList<Integer> stack) {
        System.out.println(stack.size());
    }

    static void topX(ArrayList<Integer> stack) {
        if(stack.size() == 0) {
            System.out.println(-1);
        }else {
            System.out.println(stack.get(stack.size() - 1));
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int case_num = Integer.parseInt(br.readLine());
        ArrayList<Integer> stack = new ArrayList<>();

        for(int i=0;i < case_num;i++) {
            String str = br.readLine();

            if(str.contains("push")) {
                pushX(stack, str);
            }else if(str.contains("pop")) {
                popX(stack);
            }else if(str.contains("size")) {
                sizeX(stack);
            }else if(str.contains("empty")) {
                emptyX(stack);
            }else if(str.contains("top")) {
                topX(stack);
            }
        }
    }
}

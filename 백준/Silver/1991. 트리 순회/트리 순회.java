import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    static int N;
    static HashMap<String, String[]> tree;
    static HashMap<String, Boolean> check;
    static StringBuilder sb;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        // 노드 수
        N = Integer.parseInt(br.readLine());
        // <노드, [왼쪽 노드, 오른쪽 노드]> 해시 맵
        tree = new HashMap<>();

        for(int i=0;i < N;i++) {
            String[] input = br.readLine().split(" ");
            String node = input[0];
            String[] leftright = {input[1], input[2]};

            tree.put(node, leftright);
        }

        // 항상 A가 루트 노드
        preOrder("A");
        sb.append("\n");
        inOrder("A");
        sb.append("\n");
        postOrder("A");

        System.out.println(sb);
    }

    // 전위 순회 : 루트 > 왼쪽 자식 > 오른쪽 자식
    static void preOrder(String start) {
        if(start.equals(".")) {
            return;
        }

        sb.append(start); // 루트

        String[] children = tree.get(start);
        preOrder(children[0]); // 왼쪽 자식
        preOrder(children[1]); // 오른쪽 자식
    }

    // 중위 순회 : 왼쪽 자식 > 루트 > 오른쪽 자식
    static void inOrder(String start) {
        if(start.equals(".")) {
            return;
        }

        String[] children = tree.get(start);
        inOrder(children[0]); // 왼쪽 자식
        sb.append(start); // 루트
        inOrder(children[1]); // 오른쪽 자식
    }

    // 후위 순회 : 왼쪽 자식 > 오른쪽 자식 > 루트
    static void postOrder(String start) {
        if(start.equals(".")) {
            return;
        }

        String[] children = tree.get(start);
        postOrder(children[0]); // 왼쪽 자식
        postOrder(children[1]); // 오른쪽 자식
        sb.append(start); // 루트
    }
}

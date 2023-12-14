import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    static String str;
    static HashSet<String> set;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 부분 문자열 - 문자열에서 연속된 일부분
        // ababc
        // [a, b, c], [ab, ba, bc], [aba, bab, abc], [abab, babc], [ababc]
        // 중복 없이 12개

        str = br.readLine();
        set = new HashSet<>();
        // 문자열 길이가 1 ~ 문자열길이 단위로 자르기
        for(int i=1;i <= str.length();i++) {
            lenSplit(i);
        }

        System.out.println(set.size());
    }

    static void lenSplit(int len) { // len 길이로 str를 자르면서 중복없이 set에 저장
        int start = 0;
        int end = start + len;
        
        while(end <= str.length()) {
            set.add(str.substring(start, end));
            start++; // 시작 문자를 순차적으로 증가시키면서
            end = start + len; // len의 길이를 더해 끝을 설정
        }
    }
}

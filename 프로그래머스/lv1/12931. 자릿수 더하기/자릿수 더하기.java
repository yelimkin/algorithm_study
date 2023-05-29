import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        int m = 0;
        
        while (n >= 10) {
            m = n % 10;
            answer += m;

            n = n / 10;
        }
    
        answer += n;
        return answer;
    }
    
}

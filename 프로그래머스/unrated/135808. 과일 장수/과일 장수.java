import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Integer[] tmp = Arrays.stream(score).filter(item -> item <= k).boxed().toArray(Integer[]::new);
        Arrays.sort(tmp, Comparator.reverseOrder());

        for(int i=0;i < ((tmp.length) / m);i++) {
            Integer [] box = Arrays.copyOfRange(tmp, (i * m), (i * m) + m);
            answer += box[box.length - 1] * m;
        }
    
        return answer;
    }
}
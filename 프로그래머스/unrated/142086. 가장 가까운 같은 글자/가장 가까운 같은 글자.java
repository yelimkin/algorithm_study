import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        answer[0] = -1;
        List<String> arr = Arrays.asList(s.split(""));

        StringBuilder sb = new StringBuilder(s);

        for (int i = 1; i < s.length(); i++) {
            int idx = sb.substring(0, i).indexOf(arr.get(i));
            int diff = (idx == -1) ? idx : -(sb.substring(0, i).indexOf(arr.get(i)) - i);
      
            if(sb.substring(0, i).contains(arr.get(i))) {
                sb.replace(sb.indexOf(arr.get(i)), sb.indexOf(arr.get(i)) + 1, "#");
            }
            answer[i] = diff;
        }
        return answer;
    }
}
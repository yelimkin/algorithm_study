import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(score[0]);
        answer[0] = score[0];

        for (int i = 1; i < score.length; i++) {
            if (list.size() < k) {
                list.add(score[i]);
            } else {
                if (score[i] > Collections.min(list)) {
                    list.remove(Collections.min(list));
                    list.add(score[i]);
                }
            }
            Collections.sort(list);
            answer[i] = Collections.min(list);
        }

        return answer;
    }
}
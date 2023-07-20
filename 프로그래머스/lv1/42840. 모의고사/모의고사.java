import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        ArrayList<Integer> answer = new ArrayList<>();
    
        int[] st1 = { 1, 2, 3, 4, 5 };
        int[] st2 = { 2, 1, 2, 3, 2, 4, 2, 5 };
        int[] st3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };

        int score1 = 0;
        int score2 = 0;
        int score3 = 0;

        for (int i = 0; i < answers.length; i++) {
            if (i >= st1.length) {
                score1 += (st1[i % st1.length] == answers[i]) ? 1 : 0;
            } else {
                score1 += (st1[i] == answers[i]) ? 1 : 0;
            }
            if (i >= st2.length) {
                score2 += (st2[i % st2.length] == answers[i]) ? 1 : 0;
            } else {
                score2 += (st2[i] == answers[i]) ? 1 : 0;
            }
            if (i >= st3.length) {
                score3 += (st3[i % st3.length] == answers[i]) ? 1 : 0;
            } else {
                score3 += (st3[i] == answers[i]) ? 1 : 0;
            }
        }

        int max_score = Math.max(Math.max(score1, score2), score3);

        if(score1 == max_score) {
            answer.add(1);
        }
        if(score2 == max_score) {
            answer.add(2);
        }
        if(score3 == max_score) {
            answer.add(3);
        }
        return answer.stream().mapToInt(i -> i).toArray();
    }
}
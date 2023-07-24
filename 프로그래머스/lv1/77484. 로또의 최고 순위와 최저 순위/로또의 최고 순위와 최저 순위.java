import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        ArrayList<Integer> win_list = (ArrayList<Integer>)Arrays.stream(win_nums).boxed().collect(Collectors.toList());
        int cnt = 0;
        int zero = 0;

        for (int i = 0; i < lottos.length; i++) {
            if (win_list.contains(lottos[i])) cnt++;
            if (lottos[i] == 0) zero++;
        }

        switch (cnt + zero) {
            case 6:
                answer[0] = 1;
                break;
            case 5:
                answer[0] = 2;
                break;
            case 4:
                answer[0] = 3;
                break;
            case 3:
                answer[0] = 4;
                break;
            case 2:
                answer[0] = 5;
                break;
            default:
                answer[0] = 6;
        }

        switch (cnt) {
            case 6:
                answer[1] = 1;
                break;
            case 5:
                answer[1] = 2;
                break;
            case 4:
                answer[1] = 3;
                break;
            case 3:
                answer[1] = 4;
                break;
            case 2:
                answer[1] = 5;
                break;
            default:
                answer[1] = 6;
        }

        return answer;
    }
}
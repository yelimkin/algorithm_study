import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];

        int sum = 0;
        List<String> n_list = new ArrayList<>(Arrays.asList(name));

        for(int i=0;i < photo.length;i++) {
            for(int j=0;j < photo[i].length;j++) {
                sum += (n_list.indexOf(photo[i][j]) == -1) ? 0 : yearning[n_list.indexOf(photo[i][j])];
            }
            answer[i] = sum;
            sum = 0;
        }
    
        return answer;
    }
}
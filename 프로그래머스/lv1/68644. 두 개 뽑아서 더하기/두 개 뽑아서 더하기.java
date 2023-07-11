import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                set.add((numbers[i] + numbers[j]));
            }

        }
        Integer[] answer = set.toArray(new Integer[0]);
        Arrays.sort(answer);

        return Arrays.stream(answer).mapToInt(Integer::intValue).toArray();
    }
}
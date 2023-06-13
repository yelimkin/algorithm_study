import java.util.*;

class Solution {
  public int[] solution(int[] arr, int divisor) {
    int[] no_answer = { -1 };
    ArrayList<Integer> list = new ArrayList<>();
    int cnt = 0;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] % divisor == 0) {
        list.add(arr[i]);
        cnt++;
      }
    }
    int[] answer = list.stream().mapToInt(i -> i).toArray();
    Arrays.sort(answer);
    return cnt == 0 ? no_answer : answer;
  }
}
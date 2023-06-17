import java.util.Arrays;

class Solution {
  public int solution(int[] numbers) {
    int answer = 45 - Arrays.stream(numbers).sum();

    return answer;
  }
}
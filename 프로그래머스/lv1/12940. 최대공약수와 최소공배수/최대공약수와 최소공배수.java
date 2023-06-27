class Solution {
  public int[] solution(int n, int m) {
    int[] answer = { 1, 1 };

    int max = 0;
    for (int i = 1; i <= ((n > m) ? n : m); i++) {
      if ((n % i == 0) && (m % i == 0)) {
        if (max < i) {
          answer[0] = i;
        }
      }
    }

    answer[1] = answer[0] * (n / answer[0]) * (m / answer[0]);
    return answer;
  }
}
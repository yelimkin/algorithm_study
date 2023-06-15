class Solution {
  public int solution(int[] absolutes, boolean[] signs) {
    int answer = 0;

    for(int i = 0;i < absolutes.length;i++) {
      answer = signs[i] ? answer + absolutes[i] : answer - absolutes[i];
    }
    return answer;
  }
}
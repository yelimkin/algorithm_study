class Solution {
  public int solution(int num) {
    int answer = 0;
    long n = num;
    while(n != 1) {
      n = (n % 2 == 0) ? (n / 2) : (3 * n + 1);
      answer++;
    }
    
    return (answer >= 500) ? -1 : answer;
  }
}
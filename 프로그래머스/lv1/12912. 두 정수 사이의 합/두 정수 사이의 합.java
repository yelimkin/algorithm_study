class Solution {
  public long solution(int a, int b) {
    long answer = a;
    int num = b - a;
    while(num != 0) {
      if(num > 0) {
        answer += (++a);
        num--;
      }else if(num < 0) {
        answer += (--a);
        num++;
      }
    }
        
    return answer;
  }
}
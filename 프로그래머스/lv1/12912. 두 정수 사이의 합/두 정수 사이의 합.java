class Solution {
  public long solution(int a, int b) { // a = -1, b = 3
    long answer = a; // -1
    int num = b - a; // 4
    while(num != 0) { 
      if(num > 0) {
        answer += (++a);
        num--;
      }else if(num < 0) {
        answer += (--a);
        num++;
      }
    }
    // num = 4, a = -1 -> answer = -1 + 0 = -1
    // num = 3, a = 0 -> answer = -1 + 1 = 0
    // num = 2, a = 1 -> answer = 0 + 2 = 2
    // num = 1, a = 2 -> answer = 2 + 3 = 5
    // num = 0
        
    return answer;
  }
}

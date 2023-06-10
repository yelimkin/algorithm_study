class Solution {
  public int solution(int num) {
    int answer = 0;
    // 아래 while문에서 num를 콜라츠 추측에 따라 연산할 때, int의 범위를 넘을 경우가 생길 수 있다. 
    // 그러면 오버플로우가 생겨 num이 음수가 되기 떼문에 제대로된 연산을 하지 못하기 때문에
    // 계속된 연산으로 커진 num을 담을 수 있도록 long 타입에 넣어준다.
    long n = num;
    while(n != 1) {
      n = (n % 2 == 0) ? (n / 2) : (3 * n + 1);
      answer++;
    }
    
    return (answer >= 500) ? -1 : answer;
  }
}

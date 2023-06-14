import java.util.*;

class Solution {
  public long solution(long n) {
    long answer = 0;
    ArrayList<Long> num = new ArrayList<>();

    while (n > 10) {
      long add_num = n % 10;
      num.add(add_num);
      n /= 10;
    }
    num.add(n);
    
    Collections.sort(num, Collections.reverseOrder());

    int i = 0;
    while (i < num.size()) {
      answer += (Math.pow(10, i) * num.get((num.size() - 1) - i));
      i++;
    }

    return answer;
  }
}

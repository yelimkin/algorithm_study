import java.util.*;

class Solution {
  public long solution(long n) {
    long answer = 0;
    ArrayList<Long> num = new ArrayList<>();

    while (n > 10) { // 숫자의 자릿수 가져오기 (10으로 나누어 나온 나머지 = 자릿수)
      long add_num = n % 10;
      num.add(add_num);
      n /= 10;
    }
    num.add(n);
    
    Collections.sort(num, Collections.reverseOrder());

    int i = 0;
    while (i < num.size()) { // [8, 7, 3, 2, 1, 1]
      answer += (Math.pow(10, i) * num.get((num.size() - 1) - i)); // 내림차순으로 정렬된 배열의 수를 자릿수로 더하기
      i++;
      // i = 0 -> answer = 10^0 * (num.get((5-1) - 0) -> 내림차순된 배열의 5번째 요소 가져옴 -> 1) -> 1 * 1 = 1 / answer = 1
      // i = 1 -> answer = 10^1 * (num.get((5-1) - 1) -> 내림차순된 배열의 4번째 요소 가져옴 -> 1) -> 10 * 1 = 10 / answer = 11
      // i = 2 -> answer = 10^2 * (num.get((5-1) - 2) -> 내림차순된 배열의 3번째 요소 가져옴 -> 2) -> 100 * 2 = 200 / answer = 211
      // i = 3 -> answer = 10^3 * (num.get((5-1) - 3) -> 내림차순된 배열의 2번째 요소 가져옴 -> 3) -> 1000 * 3 = 3000 / answer = 3211
      // i = 4 -> answer = 10^4 * (num.get((5-1) - 4) -> 내림차순된 배열의 1번째 요소 가져옴 -> 7) -> 10000 * 7 = 70000 / answer = 73211
      // i = 5 -> answer = 10^5 * (num.get((5-1) - 5) -> 내림차순된 배열의 0번째 요소 가져옴 -> 8) -> 100000 * 8 = 800000 / answer = 873211
    }

    return answer;
  }
}

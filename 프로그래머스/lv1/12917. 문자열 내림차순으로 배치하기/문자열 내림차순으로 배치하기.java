import java.util.Arrays;
import java.util.Collections;

class Solution {
  public String solution(String s) {
    String [] str = s.split("");
    Arrays.sort(str, Collections.reverseOrder());
    return String.join("", str);
  }
}
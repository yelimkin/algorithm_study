class Solution {
  public String solution(String s) {
    StringBuilder sb = new StringBuilder(s);
    String answer = s.length() % 2 == 0 ? sb.substring((s.length() / 2) - 1, (s.length() / 2) + 1) : sb.substring((s.length() / 2), (s.length() / 2) + 1);
    return answer;
  }
}
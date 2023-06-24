class Solution {
  public boolean solution(String s) {
    try {
      if(s.length() == 4 || s.length() == 6) {
        Integer.valueOf(s);
        return true;
      }
      return false;
    } catch (NumberFormatException ex) {
      return false;
    }
  }
}

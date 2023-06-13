class Solution {
  public String solution(String[] seoul) {
    String answer = "";
    int i = 0;
    while(i < seoul.length) {
      if(seoul[i].equals("Kim")) {
        answer = "김서방은 " + Integer.toString(i) + "에 있다";
      }
      i++;
    }
    return answer;
  }
}
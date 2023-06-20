class Solution {
  public String solution(int n) {
    StringBuilder sb = new StringBuilder("수");
    for(int i=2;i <= n;i++){
      if (i % 2 == 0) {
        sb.append("박");
      }else {
        sb.append("수");
      }
    }
    return sb.toString();
  }
}
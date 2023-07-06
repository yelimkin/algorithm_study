class Solution {
    public int solution(String t, String p) {
        int answer = 0;
  
        for(int i = 0;t.length() >= i + p.length();i++) {
            long sub = Long.valueOf(t.substring(i, i + p.length()));
      
            if(sub <= Long.valueOf(p)) {
                answer++;
            }
        }
    
        return answer;
    }
}
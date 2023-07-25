import java.util.regex.Pattern;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;

        for(String b : babbling) {
            b = b.replaceAll("aya", "1");
            b = b.replaceAll("ye", "2");
            b = b.replaceAll("woo", "3");
            b = b.replaceAll("ma", "4");
    
            if(Pattern.matches("^[0-9]*$", b)) {
                if(!(b.contains("11")) && !(b.contains("22")) && !(b.contains("33")) && !(b.contains("44"))){
                    answer++;
                }
            }
        }

        return answer;
    }
}
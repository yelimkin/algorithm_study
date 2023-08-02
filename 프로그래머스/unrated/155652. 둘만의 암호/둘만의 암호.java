class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";

        for (int i = 0; i < s.length(); i++) { // "aukks"
            char c = s.charAt(i); // 'a' 'u' 'k' 'k' 's'
            for (int j = 0; j < index; j++) {
                c += 1;
                if (c > 'z') {
                    c -= 26;
                }
                if (skip.contains(String.valueOf(c))) {
                    j--;
                }
            }
            answer += c;
        }

        return answer;
    }
}
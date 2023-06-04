class Solution {
    public int[] solution(long n) {
        int[] answer = new int[String.valueOf(n).length()];
        int idx = 0;

        while (n >= 10) {
            answer[idx] = (int)(n % 10);
            n /= 10;
            idx++;
        }
        answer[idx] = (int)n;

        return answer;
    }
}
class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        while((answer.length - n) < answer.length) {
            answer[answer.length - n] = (long)x * (answer.length - n + 1);
            n--;
        }
        return answer;
    }
}
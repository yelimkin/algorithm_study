class Solution {
    public int solution(int n) {
        int answer = 0;
    
        int i = 1;
        while(i <= n){
            if((i != 1) && ((n - 1) % i == 0)) {
                answer = i;
                break;
            }
            i++;
        }
        return answer;
    }
}
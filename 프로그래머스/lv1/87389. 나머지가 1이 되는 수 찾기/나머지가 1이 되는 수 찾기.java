class Solution {
    public int solution(int n) {
        int answer = 0;
    
        int i = 1;
        // for(int i=1;i <= n;i++)
        while(i <= n){ 
            // n - 1 = ? * x
            if((i != 1) && ((n - 1) % i == 0)) { 
                answer = i;
                break;
            }
            i++;
        }
        return answer;
    }
}
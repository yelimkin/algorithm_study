class Solution {
    boolean solution(String s) {
        int idx = 0;
        int cnt_p = 0;
        int cnt_y = 0;
    
        while(idx < s.length()){
            if(s.toLowerCase().charAt(idx) == 'p'){
                cnt_p++;
            }else if(s.toLowerCase().charAt(idx) == 'y') {
                cnt_y++;
            }
            idx++;
        }
        return cnt_p == cnt_y ? true : false;
    }
}
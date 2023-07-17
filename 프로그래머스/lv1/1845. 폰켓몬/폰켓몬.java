import java.util.*;

class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>() {
            {
                for (int i = 0; i < nums.length; i++) {
                    add(nums[i]);
                }
            }
        };

        int answer = ((nums.length / 2) > set.size()) ? set.size() : (nums.length / 2);
        return answer;
    }
}
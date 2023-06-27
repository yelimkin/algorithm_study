import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int num = -1;
        ArrayList<Integer> st = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (num != arr[i]) {
                st.add(arr[i]);
                num = arr[i];
            }
        }

        return st.stream().mapToInt(i -> i).toArray();
    }
}
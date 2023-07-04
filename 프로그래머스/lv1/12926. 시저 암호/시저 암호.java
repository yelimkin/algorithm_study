class Solution {
    public String solution(String s, int n) {
        String all = "abcdefghijklmnopqrstuvwxyz";

        String[] copy_arr = s.split("");

        for (int i = 0;i < copy_arr.length;i++) {
            int idx = all.indexOf(copy_arr[i].toLowerCase());
            boolean upper = Character.isUpperCase(copy_arr[i].charAt(0));
      
            if (idx == -1) {
                copy_arr[i] = " ";
            } else {
                copy_arr[i] = (idx + n > 25) ? String.valueOf(all.charAt((n - 1) - (25 - idx)))
            : String.valueOf(all.charAt(idx + n));
                copy_arr[i] = (upper) ? copy_arr[i].toUpperCase() : copy_arr[i];
            }

        }

        return String.join("", copy_arr);
    }
}
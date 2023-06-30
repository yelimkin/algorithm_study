class Solution {
    public String solution(String s) {
        String [] arr = s.split("");

        int check = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals(" ")) {
                check = 0;
                continue;
            } 
            
            arr[i] = (check % 2 == 0) ? arr[i].toUpperCase() : arr[i].toLowerCase();
            check++;
        }

        return String.join("", arr);

    }
}
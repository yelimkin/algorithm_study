class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        int i = 0;
        while(i < arr.length){
            answer += arr[i];
            i++;
        }
        return answer / arr.length;
    }
}
class Solution {
    public int solution(int a, int b, int n) {
        int cola = 0;

        while (n >= a) {
            cola += b * (n / a);
            n = (b * (n / a)) + (n % a);
        }   
        return cola;
    }
}
class Solution {
    public long solution(long n) {
        return String.valueOf(Math.sqrt(n)).matches("(.*).0") ? (long) Math.pow(Math.sqrt(n) + 1, 2) : -1;
        // n = 3일 경우,
        // Math.sqrt(3) = 1.7...
        // String.valueOf(1.7...) = "1.7...."
        // "1.7....".matches("(.*).0") -> false가 반환됨 
        // : Math.sqrt의 반환값은 double이므로 121의 제곱근이라면 11.0이 나오므로 n=121이라면 "11.0" == matches("(.*).0")에 맞는 조건이 되어 true를 반환됨
        // solution 함수에서 -1을 반환
    }
}

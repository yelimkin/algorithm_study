class Solution {
    public long solution(long n) {
        return String.valueOf(Math.sqrt(n)).matches("(.*).0") ? (long) Math.pow(Math.sqrt(n) + 1, 2) : -1;
    }
}
class Solution {
    public String solution(int a, int b) {
        String[] week = { "THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED" };
        int num = 0;

        for (int i = 1; i < a; i++) {
            if (i == 2) {
                num += 29;

            } else if (i < 8) {
                num += (i % 2 == 0) ? 30 : 31;

            } else {
                num += (i % 2 == 0) ? 31 : 30;

            }
        }

        return week[(num + b) % 7];
    }
}
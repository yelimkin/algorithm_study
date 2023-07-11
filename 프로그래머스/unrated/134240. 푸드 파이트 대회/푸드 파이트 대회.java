class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < food.length; i++) {
            sb.append(String.valueOf(i).repeat(food[i] / 2));
        }

        String left = sb.toString();
        String right = sb.reverse().toString();

        return left + "0" + right;
    }
}
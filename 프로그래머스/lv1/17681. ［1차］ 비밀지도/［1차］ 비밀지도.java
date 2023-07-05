class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        StringBuilder arr1_all = new StringBuilder();
        StringBuilder arr2_all = new StringBuilder();

        for (int i = 0; i < n; i++) {
            StringBuilder tmp1 = new StringBuilder(Integer.toBinaryString(arr1[i])).insert(0,
          "0".repeat(n - Integer.toBinaryString(arr1[i]).length()));

            StringBuilder tmp2 = new StringBuilder(Integer.toBinaryString(arr2[i])).insert(0,
          "0".repeat(n - Integer.toBinaryString(arr2[i]).length()));

            arr1_all.append(tmp1);

            arr2_all.append(tmp2);

        }

        String[] s1 = arr1_all.toString().split("");
        String[] s2 = arr2_all.toString().split("");
        StringBuilder tmp = new StringBuilder();

        for (int i = 0; i < s1.length; i++) {
            if (s1[i].equals("1") || s2[i].equals("1")) {
                tmp.append("#");
            } else {
                tmp.append(" ");
            }
            if ((i + 1) % n == 0) {
                answer[((i + 1) / n) - 1] = tmp.toString();
                tmp = new StringBuilder();
            }
        }

        return answer;
    }
}
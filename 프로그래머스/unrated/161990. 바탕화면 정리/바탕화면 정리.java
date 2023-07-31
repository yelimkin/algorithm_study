class Solution {
    public int[] solution(String[] wallpaper) {
        int min_idx_i = 0; int min_idx_j = 0;
        int max_idx_i = 1; int max_idx_j = 1;
        // 시작 좌표 작을수록, 끝 좌표는 클수록
        // (i, j)

        for(int i=0;i < wallpaper.length;i++) {
            if(wallpaper[i].indexOf("#") != -1) min_idx_j = wallpaper[i].indexOf("#");
            if(wallpaper[i].contains("#")) {
                min_idx_i = i;
                break;
            }
        }

        for(int j=0;j < wallpaper.length;j++) {
            min_idx_j = ((wallpaper[j].indexOf("#") != -1) && (wallpaper[j].indexOf("#") < min_idx_j)) ? wallpaper[j].indexOf("#") : min_idx_j;

            max_idx_i = (wallpaper[j].contains("#")) ? j+1 : max_idx_i;
            int max_file = (wallpaper[max_idx_i - 1].indexOf("#") != -1) ? wallpaper[max_idx_i - 1].length() - new StringBuilder(wallpaper[max_idx_i - 1]).reverse().indexOf("#") : 1;
            max_idx_j = (max_idx_j < max_file) ? max_file : max_idx_j;
        }

        int[] answer = {min_idx_i, min_idx_j, max_idx_i, max_idx_j};
        return answer;
    }
}
class Solution {
    public String solution(String[] survey, int[] choices) {
        int r_score = 0; int t_score = 0; int c_score = 0; int f_score = 0;
        int j_score = 0; int m_score = 0; int a_score = 0; int n_score = 0;

        for(int i=0;i < survey.length;i++) {
            switch(survey[i]) {
                case "RT" :
                    if(choices[i] < 4) {
                        r_score += (4 - choices[i]);
                    }else if(choices[i] > 4){
                        t_score += (choices[i] - 4);
                    }
                    break;
                case "TR" :
                    if(choices[i] < 4) {
                        t_score += (4 - choices[i]);
                    }else if(choices[i] > 4){
                        r_score += (choices[i] - 4);
                    }
                    break;
                case "CF" :
                    if(choices[i] < 4) {
                        c_score += (4 - choices[i]);
                    }else if(choices[i] > 4){
                        f_score += (choices[i] - 4);
                    }
                    break;
                case "FC" :
                    if(choices[i] < 4) {
                        f_score += (4 - choices[i]);
                    }else if(choices[i] > 4){
                        c_score += (choices[i] - 4);
                    }
                    break;
                case "JM" :
                    if(choices[i] < 4) {
                        j_score += (4 - choices[i]);
                    }else if(choices[i] > 4){
                        m_score += (choices[i] - 4);
                    }
                    break;
                case "MJ" :
                    if(choices[i] < 4) {
                        m_score += (4 - choices[i]);
                    }else if(choices[i] > 4){
                        j_score += (choices[i] - 4);
                    }
                    break;
                case "AN" :
                    if(choices[i] < 4) {
                        a_score += (4 - choices[i]);
                    }else if(choices[i] > 4){
                        n_score += (choices[i] - 4);
                    }
                    break;
                case "NA" :
                    if(choices[i] < 4) {
                        n_score += (4 - choices[i]);
                    }else if(choices[i] > 4){
                        a_score += (choices[i] - 4);
                    }
                    break;
            }
        }

        StringBuilder sb = new StringBuilder();
        if(r_score == t_score) {
            // 삼항 연산자의 조건문은 항상 false
            sb.append((("R".charAt(0) - '0') > ("T".charAt(0) - '0')) ? "T" : "R");
        }else if(r_score > t_score) {
            sb.append("R");
        }else if(r_score < t_score) {
            sb.append("T");
        }
        if(c_score == f_score) {
            sb.append((("C".charAt(0) - '0') > ("F".charAt(0) - '0')) ? "F" : "C");
        }else if(c_score > f_score) {
            sb.append("C");
        }else if(c_score < f_score) {
            sb.append("F");
        }
        if(j_score == m_score) {
            sb.append((("J".charAt(0) - '0') > ("M".charAt(0) - '0')) ? "M" : "J");
        }else if(j_score > m_score) {
            sb.append("J");
        }else if(j_score < m_score) {
            sb.append("M");
        }
        if(a_score == n_score) {
            sb.append((("A".charAt(0) - '0') > ("N".charAt(0) - '0')) ? "N" : "A");
        }else if(a_score > n_score) {
            sb.append("A");
        }else if(a_score < n_score) {
            sb.append("N");
        }

        return sb.toString();
    }
}
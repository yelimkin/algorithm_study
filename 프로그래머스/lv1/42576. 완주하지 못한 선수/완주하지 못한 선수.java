import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0;i < participant.length;i++) {
            int cnt = (map.containsKey(participant[i])) ? map.get(participant[i]) : 0;
            map.put(participant[i], ++cnt);
        }

        for(String c : completion) {
            int reset = map.get(c);
            if(map.containsKey(c)) {
                map.replace(c, --reset);
            }
        }

        for(String k : map.keySet()) {
            if(map.get(k) == 1) return k;
        }
        return "";
    }
}
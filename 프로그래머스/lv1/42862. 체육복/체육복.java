import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
// import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int lost_cnt  = lost.length;
        Arrays.sort(lost);
        Arrays.sort(reserve);
        List<Integer> lost_list = Arrays.stream(lost).boxed().collect(Collectors.toList());
        List<Integer> rsrv_list = Arrays.stream(reserve).boxed().collect(Collectors.toList());

        for(int lst : lost) {
            if(rsrv_list.contains(lst)) {
                lost_list.remove(lost_list.indexOf(lst));
                rsrv_list.remove(rsrv_list.indexOf(lst));
                lost_cnt--;
            }
        }

        Integer[] ll = lost_list.toArray(new Integer[0]);
        Integer[] rl = rsrv_list.toArray(new Integer[0]);

        for(int i=0;i < ll.length;i++) {
            for(int j=0;j < rl.length;j++) {
                if((ll[i] - 1) == rl[j] || (ll[i] + 1) == rl[j]) {
                    ll[i] = -1;
                    rl[j] = -1;
                    lost_cnt--;
                }
            }
        }

        return n - lost_cnt;
    }
}
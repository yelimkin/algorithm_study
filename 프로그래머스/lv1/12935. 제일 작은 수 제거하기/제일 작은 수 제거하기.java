import java.util.*;

class Solution {
  public int[] solution(int[] arr) {
    int[] answer = { -1 };
    
    ArrayList<Integer> list = new ArrayList<>(arr.length);
    // int min = 1000000000;
    for(int i : arr) {
      if(arr.length == 1){
        return answer;
      }// else if(min > i) {
      list.add(i);
      // }
    }
    list.remove(Collections.min(list));
  
    return list.stream().mapToInt(i -> i).toArray();
  }
}
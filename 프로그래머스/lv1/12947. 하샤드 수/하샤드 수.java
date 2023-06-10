class Solution {
  public boolean solution(int x) {
    int first_num = x;
    int num_sum = 0;
    
    while(x > 0) {
      num_sum += (x % 10);
      x /= 10;
    }
    
    return first_num % num_sum == 0 ? true : false;
  }
}
import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        Set<Integer> set = new HashSet<>();
        for (int i =0; i< nums.length; i++) {
            set.add(nums[i]);
        }
        
        for (int i = 0; i< set.size(); i++) {
            if(i < nums.length/2) {
                answer++;
            }
        }
        return answer;
    }
}
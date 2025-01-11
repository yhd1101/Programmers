class Solution {
    public int solution(int[] nums) {
       int answer =0;
        for (int i =0; i< nums.length; i++) {
            for (int j = i+1; j <nums.length; j++) {
                for (int s = j+1 ; s <nums.length; s++) {
                    int sum = 0;
                    sum = sum + nums[i] + nums[j] + nums[s];
                    answer = check(sum)  == true? answer+1 : answer;
                }
            }
        }
        return answer;
    }
    
     private static boolean check(int sum) {
        int cnt = 0;
        for (int i =1; i<=sum; i++) {
            if ( sum % i == 0) {
                cnt ++;
            }
        }
        if (cnt == 2) {
            return  true;
        } else {
            return  false;
        }
    }

}
class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int original = x;  // 원래 숫자 저장
        int sum = 0;

        while (x > 0) {
            int digit = x % 10;  // 한 자리 숫자 꺼냄
            sum += digit;       // 바로 더함
            x /= 10;            // 마지막 자리 제거
        }

        if ( original % sum == 0) {
            answer = true;
        } else {
            answer = false;
        }
        
        return answer;
    }
}
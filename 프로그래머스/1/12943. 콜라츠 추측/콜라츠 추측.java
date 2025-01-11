class Solution {
    public int solution(long num) {
        int cnt = 0;
        
        while (num > 0) {
            if (cnt >= 500) {
                return -1; // 500 이상인 경우 즉시 -1 반환
            }
            if (num == 1) {
                return cnt; // num이 1이면 횟수 반환
            }
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = num * 3 + 1;
            }
            cnt++;
        }
        return cnt;
    }
}

class Solution {
    public int solution(String s) {
        int answer = 0;
        // 첫번째 문자 카운트
        int i = 0;
        
        while (i < s.length()) {
            int same = 0;
            int diff =0;
            char standard = s.charAt(i);
            int j = i;
            while (j < s.length()) {
                if (standard == s.charAt(j)) {
                    same ++;
                } else {
                    diff++;
                }
                j++;
                if (same == diff) {
                    break;
                }
            }
            i = j;
            answer++;
        }
        return answer;
    }
}
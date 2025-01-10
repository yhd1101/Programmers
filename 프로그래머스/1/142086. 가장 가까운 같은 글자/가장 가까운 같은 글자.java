class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
         for (int i = 0; i < s.length(); i++) {
            answer[i] = -1; // 기본값 설정
            for (int j = 0; j < i; j++) {
                if (s.charAt(i) == s.charAt(j)) { // 문자 비교
                    answer[i] = i - j; // 현재 인덱스와 이전 인덱스의 거리 계산
                }
            }
        }
        return answer;
    }
}
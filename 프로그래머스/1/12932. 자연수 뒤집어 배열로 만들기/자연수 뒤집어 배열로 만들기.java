class Solution {
    public int[] solution(long n) {
         int[] answer = new int[String.valueOf(n).length()]; 
         int i = 0; // 인덱스 초기화
        while (n > 0) {
            answer[i] = (int) (n % 10); // 나머지를 배열에 저장
            n = n / 10; // 숫자를 10으로 나눔
            i++;
        }
        return answer;

    }
}
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] rank = {6, 6, 5, 4, 3, 2, 1};
        int maxMatch = 0; // 최고 순위 일치 개수
        int minMatch = 0; // 최저 순위 일치 개수

        // 0과 일치하는 번호 확인
        for (int lotto : lottos) {
            if (lotto == 0) {
                maxMatch++;
                continue;
            }
            for (int win_num : win_nums) {
                if (lotto == win_num) {
                    maxMatch++;
                    minMatch++;
                    break;
                }
            }
        }

        // 순위 계산
        int[] answer = {rank[maxMatch], rank[minMatch]};
        return answer;
    }
}

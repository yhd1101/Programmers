import java.util.Arrays;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int zeroCount = 0;
        int matchCount = 0;

        Arrays.sort(lottos);
        Arrays.sort(win_nums);

        for (int i = 0; i < lottos.length; i++) {
            if (lottos[i] == 0) {
                zeroCount++;
                continue;
            }
            for (int j = 0; j < win_nums.length; j++) {
                if (lottos[i] == win_nums[j]) {
                    matchCount++;
                    break; // 중복 방지
                }
            }
        }

        int max = matchCount + zeroCount;
        int min = matchCount;

        answer[0] = getRank(max);
        answer[1] = getRank(min);

        return answer;
    }

    private int getRank(int count) {
        return count >= 2 ? 7 - count : 6;
    }
}

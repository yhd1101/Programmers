import java.util.Arrays;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        Arrays.sort(lost);
        Arrays.sort(reserve);
        int answer = n - lost.length;

        // 여벌도 있고 도난도 당한 사람은 자기 거 입음
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    lost[i] = -1;
                    reserve[j] = -1;
                    answer++;
                    break;
                }
            }
        }

        // 남은 애들끼리 빌려주기
        for (int i = 0; i < lost.length; i++) {
            if (lost[i] == -1) continue;

            for (int j = 0; j < reserve.length; j++) {
                if (reserve[j] == -1) continue;

                if (reserve[j] == lost[i] - 1 || reserve[j] == lost[i] + 1) {
                    answer++;
                    reserve[j] = -1;
                    break;
                }
            }
        }

        return answer;
    }
}

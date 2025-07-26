import java.util.Arrays;

class Solution {
    public String solution(String[] participant, String[] completion) {
        // 참가자와 완주자 배열 정렬
        Arrays.sort(participant);
        Arrays.sort(completion);

        // 정렬된 배열을 비교해서 다른 값이 나오면 그게 미완주자
        for (int i = 0; i < completion.length; i++) {
            if (!participant[i].equals(completion[i])) {
                return participant[i];
            }
        }

        // 마지막 사람이 미완주자일 경우
        return participant[participant.length - 1];
    }
}

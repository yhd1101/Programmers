class Solution {
    public int solution(String dartResult) {
        int[] score = new int[3];
        int idx = 0;

        for (int i = 0; i < dartResult.length(); i++) {
            char ch = dartResult.charAt(i);

            // 숫자인 경우
            if (Character.isDigit(ch)) {
                if (ch == '1' && i + 1 < dartResult.length() && dartResult.charAt(i + 1) == '0') {
                    score[idx] = 10;
                    i++; // '0' 소비
                } else {
                    score[idx] = ch - '0';
                }
            }
            // 보너스 처리
            else if (ch == 'S') {
                score[idx] = (int) Math.pow(score[idx], 1);
                idx++;
            } else if (ch == 'D') {
                score[idx] = (int) Math.pow(score[idx], 2);
                idx++;
            } else if (ch == 'T') {
                score[idx] = (int) Math.pow(score[idx], 3);
                idx++;
            }
            // 옵션 처리
            else if (ch == '*') {
                if (idx >= 2) score[idx - 2] *= 2; // 이전 점수
                score[idx - 1] *= 2; // 현재 점수
            } else if (ch == '#') {
                score[idx - 1] *= -1;
            }
        }

        // 총합 계산
        int answer = 0;
        for (int s : score) {
            answer += s;
        }

        return answer;
    }
}

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];

        
         for (int t = 0; t < targets.length; t++) {
            String tar = targets[t];

            for (int i = 0; i < tar.length(); i++) {
                char s = tar.charAt(i);
                int min = Integer.MAX_VALUE;
                
                for (String key : keymap) {
                    for (int j = 0; j < key.length(); j++) {
                        if (key.charAt(j) == s) {
                            min = Math.min(min, j + 1); // j+1: 실제 누르는 횟수
                            break; // 이 keymap에서는 더 볼 필요 없음
                        }
                    }
                }

                if (min == Integer.MAX_VALUE) {
                    answer[t] = -1; // 해당 문자 못 찾음
                    break; // 이 단어 자체를 만들 수 없음
                } else {
                    answer[t] += min; // 누적 입력 횟수
                }
            }
        }

        return answer;
    }
}
class Solution {
    public String solution(String s, String skip, int index) {
        boolean[] isSkip = new boolean[26];
        for (char c : skip.toCharArray()) {
            isSkip[c - 'a'] = true; // 건너뛸 문자 표시
        }

        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            int cnt = 0;
            char cur = c;
            while (cnt < index) {
                cur++;
                if (cur > 'z') cur = 'a'; // z 다음은 a로 순환
                if (isSkip[cur - 'a']) continue; // skip 문자면 건너뜀
                cnt++;
            }
            sb.append(cur);
        }

        return sb.toString();
    }
}

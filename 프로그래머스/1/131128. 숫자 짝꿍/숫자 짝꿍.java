class Solution {
    public String solution(String X, String Y) {
        int[] countX = new int[10];
        int[] countY = new int[10];

        for (char c : X.toCharArray()) {
            countX[c - '0']++;
        }
        for (char c : Y.toCharArray()) {
            countY[c - '0']++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 9; i >= 0; i--) { // 큰 수부터 넣기 위해 9부터 0까지
            int minCount = Math.min(countX[i], countY[i]);
            for (int j = 0; j < minCount; j++) {
                sb.append(i);
            }
        }

        if (sb.length() == 0) {
            return "-1";
        }
        if (sb.charAt(0) == '0') { // 0으로만 이루어졌다면
            return "0";
        }
        
        return sb.toString();
    }
}
class Solution {
    public int solution(String[] babbling) {
        String[] speaks = {"aya", "ye", "woo", "ma"};
        int result = 0;

        for (String word : babbling) {
            String prev = "";
            boolean isValid = true;

            while (!word.isEmpty()) {
                boolean matched = false;

                for (String speak : speaks) {
                    if (word.startsWith(speak) && !speak.equals(prev)) {
                        word = word.substring(speak.length());
                        prev = speak;
                        matched = true;
                        break;
                    }
                }

                if (!matched) {
                    isValid = false;
                    break;
                }
            }

            if (isValid) result++;
        }

        return result;
    }
}

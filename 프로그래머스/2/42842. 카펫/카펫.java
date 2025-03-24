class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int total = brown + yellow;
        for (int i =1; i<= total; i++) {
            if(total % i ==0) {
                int a = total/i;
                int s = (i-2) * (a-2);
                if (yellow == s) {
                    answer[0] = i;
                    answer[1] = a;
                }
            }
        }

        return answer;
    }
}
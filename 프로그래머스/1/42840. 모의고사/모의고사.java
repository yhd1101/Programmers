class Solution {
    public int[] solution(int[] answers) {
        int[] one = {1,2,3,4,5};
        int[] two = { 2, 1, 2,3,2,4,2,5};
        int[] three = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int oneMax =0;
        int twoMax =0;
        int threeMax =0;
        for (int i = 0; i< answers.length; i++) {
            if (answers[i] == one[i % one.length]) oneMax++;
            if (answers[i] == two[i % two.length]) twoMax++;
            if (answers[i] == three[i % three.length]) threeMax++;
        }
        int max = Math.max(oneMax, Math.max(twoMax, threeMax));
         int[] temp = new int[3];
        int idx = 0;

        if (oneMax == max) temp[idx++] = 1;
        if (twoMax == max) temp[idx++] = 2;
        if (threeMax == max) temp[idx++] = 3;

        // 필요한 길이만큼 잘라서 리턴
        int[] answer = new int[idx];
        for (int i = 0; i < idx; i++) {
            answer[i] = temp[i];
        }

        return answer;
    }
}
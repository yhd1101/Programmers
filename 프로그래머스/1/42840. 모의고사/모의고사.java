import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> solution(int[] answers) {
        int[] one = {1, 2, 3, 4, 5};
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        List<Integer> list = new ArrayList<>();
        int[] sum = new int[3];

        // 패턴 비교
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == one[i % one.length]) {
                sum[0]++;
            }
            if (answers[i] == two[i % two.length]) { // two로 수정
                sum[1]++;
            }
            if (answers[i] == three[i % three.length]) { // three로 수정
                sum[2]++;
            }
        }
        
        int max = Math.max(Math.max(sum[0], sum[1]), sum[2]);

        for (int i = 0; i < sum.length; i++) {
            if (sum[i] == max) {
                list.add(i + 1);
            }
        }

        return list;
    }
}

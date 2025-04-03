import java.util.*;

class Solution {
    public int solution(int[] A, int[] B) {
        Arrays.sort(A); // A 오름차순
        Arrays.sort(B); // B 오름차순 후 뒤에서부터 사용

        int answer = 0;
        int n = A.length;

        for (int i = 0; i < n; i++) {
            answer += A[i] * B[n - 1 - i];
        }

        return answer;
    }
}

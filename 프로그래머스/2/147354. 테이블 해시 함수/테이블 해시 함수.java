import java.util.*;
class Solution {
    public int solution(int[][] data, int col, int row_begin, int row_end) {
        int answer = 0;

        col -= 1;
        row_begin -= 1;

        // 2. 정렬 직접 구현 (버블 정렬 또는 선택 정렬 같은 기본 정렬 알고리즘 사용)
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = i + 1; j < data.length; j++) {
                // 주어진 열 기준으로 비교
                if (data[i][col] > data[j][col]) {
                    // 두 행을 직접 교체
                    int[] temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                } else if (data[i][col] == data[j][col]) {
                    // 첫 번째 열을 기준으로 내림차순 정렬
                    if (data[i][0] < data[j][0]) {
                        // 두 행을 직접 교체
                        int[] temp = data[i];
                        data[i] = data[j];
                        data[j] = temp;
                    }
                }
            }
        }

        // 3. S_i 합 구하기
        for (int i = row_begin; i < row_end; i++) {

            int dataTotal = 0;
            for (int j = 0; j < data[i].length; j++) {
                dataTotal += data[i][j] % (i + 1);
            }

            // 4. XOR한 값 저장
            answer = answer ^ dataTotal;
        }

        return answer;
    }
}

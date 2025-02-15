class Solution {
    public int solution(int number, int limit, int power) {
        int result = 0;

        // 1부터 number까지 반복
        for (int i = 1; i <= number; i++) {
            int count = 0;

            // i의 약수를 구하기 (i의 제곱근까지만)
            for (int j = 1; j * j <= i; j++) {
                if (i % j == 0) {  // j가 i의 약수라면
                    count++;  // j는 약수
                    if (i / j != j) {  // i / j도 약수 (단, j와 i/j가 같지 않으면)
                        count++;
                    }
                }
            }

            // 약수의 개수가 limit을 넘으면 power를 더하고, 아니면 그 개수를 더함
            if (count > limit) {
                result += power;
            } else {
                result += count;
            }
        }
        return result;
    }
}

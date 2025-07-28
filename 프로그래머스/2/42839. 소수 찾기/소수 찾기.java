import java.util.*;

class Solution {
    Set<Integer> set = new HashSet<>(); // 중복 제거용
    boolean[] visited;

    public int solution(String numbers) {
        visited = new boolean[numbers.length()];
        String[] nums = numbers.split("");

        dfs("", nums); // 순열 조합 시작

        int answer = 0;
        for (int num : set) {
            if (isPrime(num)) answer++;
        }

        return answer;
    }

    // DFS로 숫자 조합 만들기
    void dfs(String comb, String[] nums) {
        if (!comb.equals("")) {
            set.add(Integer.parseInt(comb));
        }

        for (int i = 0; i < nums.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                dfs(comb + nums[i], nums); // 숫자 추가해서 재귀
                visited[i] = false; // 백트래킹
            }
        }
    }

    // 소수 판별 함수
    boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}

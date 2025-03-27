class Solution {
    int answer = 0;

    public int solution(int k, int[][] dungeons) {
        boolean[] visited = new boolean[dungeons.length];
        dfs(k, dungeons, visited, 0);
        return answer;
    }

    public void dfs(int k, int[][] dungeons, boolean[] visited, int depth) {
        answer = Math.max(answer, depth);

        for (int i = 0; i < dungeons.length; i++) {
            int need = dungeons[i][0]; // 최소 필요 피로도
            int use = dungeons[i][1];  // 소모 피로도

            if (!visited[i] && k >= need) {
                visited[i] = true;
                dfs(k - use, dungeons, visited, depth + 1);
                visited[i] = false; // 백트래킹
            }
        }
    }
}

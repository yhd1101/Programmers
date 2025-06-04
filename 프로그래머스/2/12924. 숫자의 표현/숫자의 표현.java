class Solution {
    public int solution(int n) {
        int answer = 1;
        int[] ss = new int[n];
        for (int i = 0; i< ss.length; i++) {
            ss[i] = i+1;
        }
        
        for (int i =0; i<ss.length; i++) {
            int cnt= ss[i];
            for (int j=i+1; j<ss.length; j++) {
                cnt = cnt +ss[j];
                if (cnt == n) {
                    answer++;
                } else if(cnt > n) {
                    break;
                }
            }
        }
        return answer;
    }
}
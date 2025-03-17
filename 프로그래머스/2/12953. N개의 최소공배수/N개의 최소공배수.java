class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        answer = arr[0];
        for (int i = 1; i<arr.length; i++) {
            answer = min (answer, arr[i]);
        }
        
        return answer;
    }
    
    private static int gcdRec(int a, int b) {
        if (a % b== 0) {
            return b;
        }
        return gcdRec(b, a % b);
    }
    
    private static int min(int a, int b) {
        return (a * b) / gcdRec(a, b);
    }
}
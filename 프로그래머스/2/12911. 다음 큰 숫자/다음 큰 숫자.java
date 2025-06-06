import java.util.*;
class Solution {
    public int solution(int n) {
        int a = Integer.bitCount(n);
        int answer = n+1;
        while(Integer.bitCount(answer) != a) {
            answer++;
        }
        return answer;
    }
}
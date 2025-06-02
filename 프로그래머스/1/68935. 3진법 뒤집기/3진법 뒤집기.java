import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();
        while (n>0) {
            queue.offer(n %3);
            n = n/3;
        }

        for (int i =queue.size() -1; i>=0; i--) {
            answer = answer + ((int)Math.pow(3, i) * queue.poll());
        }
        return answer;
    }
}
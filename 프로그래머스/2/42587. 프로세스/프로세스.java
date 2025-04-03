import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<int[]> queue = new LinkedList<>();
        
        for (int i = 0; i < priorities.length; i++) {
            queue.offer(new int[]{i, priorities[i]}); // {인덱스, 우선순위}
        }

        int answer = 0;
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            boolean hasHigherPriority = false;

            for (int[] q : queue) {
                if (q[1] > current[1]) {
                    hasHigherPriority = true;
                    break;
                }
            }

            if (hasHigherPriority) {
                queue.offer(current); // 다시 뒤로 보냄
            } else {
                answer++;
                if (current[0] == location) {
                    return answer;
                }
            }
        }

        return answer;
    }
}

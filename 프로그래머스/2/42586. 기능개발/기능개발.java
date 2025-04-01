import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        
        for (int i =0; i< progresses.length; i++) {
             int work = 100-progresses[i];
            int a = work/speeds[i];

            if (work % speeds[i] != 0 && (work>speeds[i] *a)) {
                a++;
            }
            queue.add(a);
        } 
        System.out.println(queue);
        while(!queue.isEmpty()) {
            int current = queue.poll();
            int cnt = 1;
            while (!queue.isEmpty() && queue.peek() <= current) {
                cnt ++;
                queue.poll();
            }
            list.add(cnt);
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i< answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
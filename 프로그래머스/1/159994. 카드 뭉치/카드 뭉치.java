import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        Queue<String> deck1 = new LinkedList<>(Arrays.asList(cards1));
        Queue<String> deck2 = new LinkedList<>(Arrays.asList(cards2));

        for (String go : goal) {
            if (!deck1.isEmpty() && deck1.peek().equals(go)) {
                deck1.poll();
            } else if (!deck2.isEmpty() && deck2.peek().equals(go)) {
                deck2.poll();
            } else {
                return "No";
            }
        }
        return "Yes";
        
        
    }
}
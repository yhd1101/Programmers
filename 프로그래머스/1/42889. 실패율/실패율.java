import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int N, int[] stages) {
        HashMap<Integer, Double> hash = new HashMap<>();
        int cnt = 0;
        int clear = stages.length;

        for (int i = 1; i <= N; i++) {
            for (int j = 0; j < stages.length; j++) {
                if (stages[j] == i) {
                    cnt++;
                }
            }
            if(clear == 0) {
                hash.put(i, 0.0);
            } else {
                hash.put(i, (double) cnt / clear);
            }
    
            clear -= cnt;
            cnt = 0;
        }
        List<Integer> list = new ArrayList<>(hash.keySet());
        list.sort((o1, o2) -> Double.compare(hash.get(o2), hash.get(o1)));

     
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}

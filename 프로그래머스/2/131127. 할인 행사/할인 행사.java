
import java.util.HashMap;
import java.util.Map;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
         Map<String, Integer> mapWants  = new HashMap<>();

        for (int i =0; i<want.length; i++) {
            mapWants.put(want[i], number[i]);
        }
        Map<String, Integer> currentMap = new HashMap<>();
        int count = 0;
        for (int i =0; i<10; i++) {
            currentMap.put(discount[i], currentMap.getOrDefault(discount[i], 0) +1); //있으면 현재값 아니면 0
        }
        if (currentMap.equals(mapWants)) {
            count ++;
        }

        for (int i = 10; i< discount.length; i++) {
            String removeItem = discount[i-10];
            int removeCount = currentMap.getOrDefault(removeItem, 1) -1;

            if (removeCount == 0) {
                currentMap.remove(removeItem);
            } else  {
                currentMap.put(removeItem, removeCount); // 아니면 개수 업데이트
            }

            String addItem = discount[i];
            currentMap.put(addItem, currentMap.getOrDefault(addItem, 0) + 1);

            // 🏆 map 비교
            if (currentMap.equals(mapWants)) {
                count++;
            }
        }
        return count;
    }
}
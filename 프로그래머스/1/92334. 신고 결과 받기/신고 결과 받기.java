import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer= new int[id_list.length];
        Map<String, Set<String>> map = new HashMap<>();

        for (int i = 0; i < report.length; i++) {
            String[] pair = report[i].split(" ");
            String key = pair[0];
            String val = pair[1];
            
            map.putIfAbsent(val, new HashSet<>());
            map.get(val).add(key);
        }

        // 정지 대상 판단 및 알림 발송
        for (String reported : map.keySet()) {
            Set<String> reporters = map.get(reported);
            if (reporters.size() >= k) {
                for (String reporter : reporters) {
                    int idx = Arrays.asList(id_list).indexOf(reporter);
                    answer[idx]++;
                }
            }
        }

        return answer;
    }
}

import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> result = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();

        // today 날짜 나누기
        String[] s = today.split("\\.");
        int todayYear = Integer.parseInt(s[0]);
        int todayMonth = Integer.parseInt(s[1]);
        int todayDay = Integer.parseInt(s[2]);

        // 약관 종류 저장
        for (String term : terms) {
            String[] parts = term.split(" ");
            map.put(parts[0], Integer.parseInt(parts[1]));
        }

        // 개인정보 순회
        for (int i = 0; i < privacies.length; i++) {
            String[] parts = privacies[i].split(" ");
            String[] dateParts = parts[0].split("\\.");
            String type = parts[1];

            int year = Integer.parseInt(dateParts[0]);
            int month = Integer.parseInt(dateParts[1]);
            int day = Integer.parseInt(dateParts[2]);

            // 유효기간 더하기
            int termMonth = map.get(type);
            month += termMonth;

            if (day == 1) {
                month -= 1;
                day = 28;
            } else {
                day -= 1;
            }

            // 12월 넘기면 연도 증가
            while (month > 12) {
                year += 1;
                month -= 12;
            }

            // 날짜를 정수로 바꿔 비교
            int expired = year * 10000 + month * 100 + day;
            int todayInt = todayYear * 10000 + todayMonth * 100 + todayDay;

            if (expired < todayInt) {
                result.add(i + 1);
            }
        }

        return result.stream().mapToInt(x -> x).toArray();
    }
}

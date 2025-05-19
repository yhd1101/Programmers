import java.util.*;

class Solution {
    public String solution(int[] numbers, String hand) {
        // 숫자별 좌표 미리 설정 (0~9)
        Map<Integer, int[]> position = new HashMap<>();
        position.put(1, new int[]{0, 0});
        position.put(2, new int[]{0, 1});
        position.put(3, new int[]{0, 2});
        position.put(4, new int[]{1, 0});
        position.put(5, new int[]{1, 1});
        position.put(6, new int[]{1, 2});
        position.put(7, new int[]{2, 0});
        position.put(8, new int[]{2, 1});
        position.put(9, new int[]{2, 2});
        position.put(0, new int[]{3, 1});

        // 시작 위치 (*, #)
        int[] leftPos = {3, 0};  // '*'
        int[] rightPos = {3, 2}; // '#'

        StringBuilder sb = new StringBuilder();

        for (int num : numbers) {
            int[] target = position.get(num);

            if (num == 1 || num == 4 || num == 7) {
                sb.append("L");
                leftPos = target;
            } else if (num == 3 || num == 6 || num == 9) {
                sb.append("R");
                rightPos = target;
            } else {
                int leftDist = Math.abs(leftPos[0] - target[0]) + Math.abs(leftPos[1] - target[1]);
                int rightDist = Math.abs(rightPos[0] - target[0]) + Math.abs(rightPos[1] - target[1]);

                if (leftDist < rightDist) {
                    sb.append("L");
                    leftPos = target;
                } else if (rightDist < leftDist) {
                    sb.append("R");
                    rightPos = target;
                } else {
                    if (hand.equals("right")) {
                        sb.append("R");
                        rightPos = target;
                    } else {
                        sb.append("L");
                        leftPos = target;
                    }
                }
            }
        }

        return sb.toString();
    }
}

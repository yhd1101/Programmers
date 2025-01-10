import java.util.*;
import java.util.stream.Stream;
public class Solution {
    public int solution(int n) {
        String numberStr = Integer.toString(n);
        int answer = 0;
        int[] arr= new int[numberStr.length()];
        
        for (int i = 0; i< numberStr.length(); i++) {
            arr[i] = numberStr.charAt(i) - '0';
        }
        
        for (int i = 0; i< arr.length; i++) {
            answer = answer + arr[i];
        }
        return answer;
    }
}
import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";

        String[] str = s.split("");  // 한 글자씩 배열로
        int x = s.length() / 2;

        if (s.length() % 2 == 0) {
            answer = str[x-1] + str[x]; 
        } else {
            answer = str[x];   // 여기 수정
        }
        
        return answer;
    }
}
import java.util.*;
class Solution {
    public boolean solution(int x) {
        boolean answer = true;
       int a = x;
        List<Integer> list = new ArrayList<>();
        int sum = 0;
        while( a> 0) {
            list.add(a %10);
            a= a/10;
        }
        for(int i =0; i< list.size(); i++) {
            sum = sum + list.get(i);
        }
        if ( x % sum ==0) {
            return answer;
        } else {
            answer = false;
            return answer;
        }
    }
}
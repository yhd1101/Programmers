class Solution {
    public String solution(String s) {
        String[] str = s.split(" ");
        int min = Integer.parseInt(str[0]);
        int max = Integer.parseInt(str[0]);
        
        for (int i = 0; i< str.length; i++) {
            int ss = Integer.parseInt(str[i]);
            if (min > ss) {
                min = ss;
            }
            if (max < ss) {
                max = ss;
            }
        }
        String result = min + " " + max;
        return result;
        
    }
}
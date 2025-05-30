class Solution {
    public String solution(String s) {
        String answer = "";
        String c = "";
        String e= "";
         char[] a = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            a[i] = s.charAt(i);
        }
        if (a.length % 2 != 0) {
            e = String.valueOf(a[a.length / 2]);
        } else {

            e= String.valueOf(a[a.length/2-1]);
            c= String.valueOf(a[a.length/2]);
            e = e+c;
        }
        
        return e; 
    }
}
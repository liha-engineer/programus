class Solution {
    public String solution(int n) {
   
        String answer = "";
        String sb = "";

        String s = "수";
        String b = "박";
        
        int i = 0;
        while (i++ < n) {
            if (i % 2 != 0) {
                
                sb += s;
                
            } else {
                
                sb += b;
            }
        } answer = sb;
        
        return answer;
    }
}
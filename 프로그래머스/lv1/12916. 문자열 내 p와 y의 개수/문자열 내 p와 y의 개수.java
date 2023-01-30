class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        int pnum = s.replaceAll("[^Pp]", "").length();
        int ynum = s.replaceAll("[^Yy]", "").length();
        
        if(pnum == ynum || (pnum == 0 && ynum == 0)) {
            answer = true;
        } else {
            answer = false;
        }
        return answer;
    }
}
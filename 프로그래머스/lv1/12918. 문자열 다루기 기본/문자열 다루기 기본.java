class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        int only = s.replaceAll("[0-9]", "").length();
        
        if ((s.length() == 4 || s.length() == 6) && only == 0) {
            
            answer = true;
            
        } else {
            answer = false;
        }
        
        return answer;
    }
}
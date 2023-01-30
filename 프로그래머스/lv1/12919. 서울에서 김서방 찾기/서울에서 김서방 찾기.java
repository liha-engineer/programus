import java.util.*;
class Solution {
    public String solution(String[] seoul) {
        String answer ="";
        
        int i;
        int len = seoul.length;
        
        for (i = 0; i < seoul.length; i++) {
            int eleng = seoul[i].length();
            
            if (len >= 1 && len <= 1000 && eleng >= 1 && eleng <= 20 && seoul[i].equals("Kim")) {

                answer = "김서방은 " + i + "에 있다";
            }
        }
        return answer;
        }
        
    }

class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        char ch;
        
        for(int i = 1; i <= cipher.length()/code ; i++) {
        ch = cipher.charAt(i * code - 1);
        answer += ch;
        }
        return answer;
    }
}
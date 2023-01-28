class Solution {
    public String solution(String phone_number) {
        
        String conceal = "";
        for (int i = 0; i < phone_number.length() - 4; i++ ) {
            conceal += "*";
        }
        String reveal = phone_number.substring(phone_number.length() - 4);
        String answer = conceal + reveal;
        return answer;
    }
}
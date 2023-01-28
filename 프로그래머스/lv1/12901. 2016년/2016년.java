class Solution {
    public String solution(int a, int b) {
       String[] yoil = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
        
        String answer = "";
        
            if ((a == 2 && b >= 1 && b <= 29) || (a == 8 && b >= 1 && b <= 31)) {
                answer = yoil[b % 7];
                } // 2월은 월요일부터 시작 -> 8월도 월요일 시작해서 추가함 -> 11월도...

            else if ((a == 3&& b >= 1 && b <= 31) || (a == 11 && b >= 1 && b <= 30)) {
                answer = yoil[(b + 1) % 7];
            } //화요일 시작

            else if (a == 6  && b >= 1 && b <= 30) {
                answer = yoil[(b + 2) % 7];
            } //수요일 시작

            else if ((a == 9 && b >= 1 && b <= 30) ||(a == 12 && b >= 1 && b <= 31)) {
                answer = yoil[(b + 3) % 7];
            } //목요일 시작

            else if (((a == 1 || a == 7) && b >= 1 && b <= 31) || (a == 4 && b >= 1 && b <= 30)) {
                answer = yoil[(b + 4) % 7];
            } // 1, 4월은 금요일부터 시작 -> 7월도 금요일 시작!! 그리고 7월 31일까지야!! 
        
            else if ( a == 10 && b >= 1 && b <= 31) {
                answer = yoil[(b + 5) % 7];
            } // 뭐해... 10월 토요일 시작이잖아...

            else if (a == 5 && b >=1 && b <= 31) {
                answer = yoil[(b + 6) % 7];
            } // 5, 8, 11월은 일요일부터 시작 => 아니야! 8월은 월요일이야 뺐어! -> 11월 일요일 시작 아니야... 화요일이야...
            
            return answer;
            } 
    }
       
    
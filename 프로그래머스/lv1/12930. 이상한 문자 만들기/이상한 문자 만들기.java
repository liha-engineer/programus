class Solution {
    public String solution(String s) {
        
        String answer = "";
        int i, j;
        String[] spl = s.split(" ", -1);

        for (i = 0; i < spl.length; i++) { // i = split된 덩어리 수
            for (j = 0; j < spl[i].length(); j++) { // j = 덩어리 내에서의 단어들 index 순서

                if (j % 2 == 0 && !Character.isWhitespace(spl[i].charAt(j))) {
                    answer += Character.toUpperCase(spl[i].charAt(j));
                } else {
                    answer += Character.toLowerCase(spl[i].charAt(j));
                }
            } // 안쪽 for문 종료

            if(answer.length() == s.length())
            {
                break;
            }
            answer += " ";

        }   // 바깥 for문 종료
            return answer;
      }
  }   
    

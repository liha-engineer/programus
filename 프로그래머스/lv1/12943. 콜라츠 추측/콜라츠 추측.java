class Solution {
    public int solution(int num) {
        int answer = 0;
        int cnt = 0;
        int i;

        for (i = 0; i < 500; i++ ) {
            if (num % 2 == 0 && (num > 1 && num <= 8000000)) {
                num = num / 2;
            } else if (num % 2 == 1 && (num > 1 && num <= 8000000)) {
                num = (num * 3) + 1;
            }
            
            if (num == 1) {
                answer = num;
            }    
            cnt++;
        }
    
        answer = cnt;
        
        if (cnt >= 500) {
            answer = -1;
        }
            return answer;
    }
}
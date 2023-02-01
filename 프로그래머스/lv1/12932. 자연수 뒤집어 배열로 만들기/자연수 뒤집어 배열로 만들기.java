import java.util.Arrays;

class Solution {
    public int[] solution(long n) {

    
        int leng = (int)Math.log10(n) + 1; // n이 몇자리수인지 알려주는 것.
        int[] answer = new int[leng];
        long quo = 0;
        long div = 1;

        int i;
        for (i = leng - 1; i >= 0 ; i--) {
            div = (long)Math.pow(10, i);
            quo = n / div;
            n %= div;

            answer[i] = (int) quo;  
        }
        
        return answer;
    }
}
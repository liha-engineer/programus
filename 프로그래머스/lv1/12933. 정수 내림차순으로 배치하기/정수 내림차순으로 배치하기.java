import java.util.*;

class Solution {
    public long solution(long n) {

        long answer = 0;
        int i;
        int leng = (int) Math.log10(n) + 1;
        long div = 0;
        long quo = 0;
        
        Long[] arr = new Long[leng];
        for (i = leng - 1; i >= 0 ; i--) {
            div = (long) Math.pow(10, i); 
            quo = n / div;
            n %= div;

            arr[leng - 1 - i] = quo; 
        }
        Arrays.sort(arr);

        for (int j = 0; j <= leng - 1; j++) {
          answer += arr[j] * (long) Math.pow(10, j);
        }
        return answer;
    }
}
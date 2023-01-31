import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        int leng = (int)Math.log10(n) + 1;

        int quo = 0;
        int div = 1;
        int realquo = 0;

        int i;
        for (i = leng - 1; i >= 0 ; i--) {
            div = (int) Math.pow(10, i); 
            quo = n / div;
            n = n - (quo * div);
            realquo += quo;
        }
        answer = realquo;

        return answer;
    }
}
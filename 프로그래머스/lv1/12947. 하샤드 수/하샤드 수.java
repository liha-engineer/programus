class Solution {
    public boolean solution(int x) {
        int q = 0;
        int div;

        int i;
        int fisrtx = x;
        for (i = (int) Math.log10(x); i >= 0; i--) {
            div = (int) Math.pow(10, i); 
            q += x / div;
            x %= div;
            
            if (div <= 0) {
                break;
            }

        }
        return ((fisrtx >= 1 && fisrtx <= 10000) && fisrtx % q == 0);
    }
}
import java.lang.Math;
class Solution {
    public long solution(long n) {
        long answer = 0;
        double root = Math.sqrt(n);
        if (root % 1 == 0) {
            answer = (long) Math.pow((Math.sqrt(n) + 1), 2);
        } else {
            answer = -1;
        }
        return answer;
    }
}

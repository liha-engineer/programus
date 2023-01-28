class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long pay = 0;
    
        for (int i = 1; i <= count; i++) {
            pay += price * i;
            
            if (pay > money) {
                answer = pay - money;
            } else {
                answer = 0;
            }
        }
        return answer;
    }
}
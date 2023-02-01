class Solution {
    public int solution(int num) {
        int answer = 0;
        int cnt = 0;
        int i;

        long longn = (long) num;

        for (i = 0; i < 500; i++) {
            if (longn == 1) {
                break;
            }
            if (longn % 2 == 0) {
                longn = longn / 2;
            } else if (longn % 2 != 0) {
                longn = (longn * 3) + 1;
            }

            cnt++;
            answer = cnt;

            if (cnt >= 500) {
                answer = -1;
            }
        }
        return answer;
    }
}
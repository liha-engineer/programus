
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        System.out.println(sol.solution(price));
    }
}

class Solution {
    public int solution(int price) {
        int answer = 0;
        int tsuri = 1000 - price;

        answer += tsuri / 500;
        tsuri %= 500;

        answer += tsuri / 100;
        tsuri %= 100;

        answer += tsuri / 50;
        tsuri %= 50;

        answer += tsuri / 10;
        tsuri %= 10;

        answer += tsuri / 5;
        tsuri %= 5;

        answer += tsuri;

        return answer;
    }
}
package level_0.kanghyegwang.q120845;

/*
주사위의 개수
문제 설명
머쓱이는 직육면체 모양의 상자를 하나 가지고 있는데 이 상자에 정육면체 모양의 주사위를 최대한 많이 채우고 싶습니다. 상자의 가로, 세로, 높이가 저장되어있는 배열 box와 주사위 모서리의 길이 정수 n이 매개변수로 주어졌을 때, 상자에 들어갈 수 있는 주사위의 최대 개수를 return 하도록 solution 함수를 완성해주세요.

제한사항
box의 길이는 3입니다.
box[0] = 상자의 가로 길이
box[1] = 상자의 세로 길이
box[2] = 상자의 높이 길이
1 ≤ box의 원소 ≤ 100
1 ≤ n ≤ 50
n ≤ box의 원소
주사위는 상자와 평행하게 넣습니다.
입출력 예
box	            n	    result
[1, 1, 1]	    1	    1
[10, 8, 6]	    3	    12
입출력 예 설명
입출력 예 #1

상자의 크기가 가로 1, 세로 1, 높이 1이므로 모서리의 길이가 1인 주사위는 1개 들어갈 수 있습니다.
입출력 예 #2

상자의 크기가 가로 10, 세로 8, 높이 6이므로 모서리의 길이가 3인 주사위는 12개 들어갈 수 있습니다.
 */

public class solution120845 {
    public int solution(int[] box, int n) {
        // 넓이를 구하는 것이므로 res를 1로 설정
        int res = 1;
        // 주어진 숫자를 하나씩 반복해서 가져옴
        for (int x : box) {
            // 가로, 세로, 높이를 모서리 길이인 n으로 나눠서 각각 곱한다
            // x = 10, 8, 6 으로 n = 3 이어서 각각 나눠서 곱하면 3*2*2 가된다 가로는 10이므로 3짜리 3개 세로는 8이므로 3짜리 2개 높이는 6이므로 3짜리 2개까지 들어간다
            res*= x/n;
        }
        return res;
    }
}
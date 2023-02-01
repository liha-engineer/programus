import java.util.*;

class Solution {
    public int[] solution(int[] arr) {

        int leng = arr.length;
        int i;

        int[] answer = new int[leng - 1];
        int min = arr[0];

        for (i = 0; i < leng; i++) {
            if (arr[i] < min) {
                min = arr[i]; //최소로 설정한 값보다 뒤에 나오는 값이 더 작다면, 뒷값을 새 최소값으로 바꿔줘 (최소값 갱신수식)
            }
        }

        int countIndex = 0;
        for (i = 0; i < leng; i++) {
            if (arr[i] == min) {
                continue;
            }
            answer[countIndex++] = arr[i];
        }
        if (leng == 1) {
            answer = new int[]{-1};
        }
        return answer;
    }
}



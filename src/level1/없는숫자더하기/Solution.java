package level1.없는숫자더하기;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {

    public int solution(int[] numbers) {
        int answer = 45;
        for(int i = 0;i<numbers.length;i++){
            answer-=numbers[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] numbers = {1,2,3,4,6,7,8,0};

        int answer = solution.solution(numbers);
        System.out.println(answer);

    }
}

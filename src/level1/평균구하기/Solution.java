package level1.평균구하기;

import java.util.Arrays;

public class Solution {

    public double solution(int[] arr) {
        double answer = 0;

        answer = (double) Arrays.stream(arr).sum() / arr.length;

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {1,2,3,4};
        double answer = solution.solution(arr);
        System.out.println(answer);
    }
}

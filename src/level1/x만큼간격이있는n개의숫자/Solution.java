package level1.x만큼간격이있는n개의숫자;

import java.util.Arrays;
public class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];

        long temp = 0;
        for(int i =0 ;i<n;i++){
            temp +=x;
            answer[i] = temp;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int x = 2;
        int n = 5;
        long[] answer = solution.solution(x, n);
        System.out.println(Arrays.toString(answer));
    }
}

package level1.약수의개수와덧셈;

import java.util.Arrays;
public class Solution {
    public int solution(int left, int right) {
        //약수의 개수가 짝수는 더하고 홀수는 뺼셈
        int answer = 0;
        for(int i=left;i<=right;i++){
            //약수 갯수 구하기
            if(yaksu(i) % 2 == 0){
                answer+=i;
            }else{
                answer-=i;
            }

        }

        return answer;
    }

    public int yaksu (int num){
        int count = 1;
        for(int i=2;i<=num;i++){
            if(num % i == 0) count++;
        }

        return count;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int left = 13;
        int right = 17;
        int answer = solution.solution(left, right);
        System.out.println(answer);

    }
}

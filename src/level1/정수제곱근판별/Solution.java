package level1.정수제곱근판별;

public class Solution {
    public long solution(long n) {
        double temp = Math.sqrt(n);
        long answer = 0;

        if(Math.pow( (int) temp,2)!=n){
            return -1;
        }else{
            answer = (long) Math.pow(temp+1,2);
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        long n = 121;
        long answer = solution.solution(n);
        System.out.println(answer);
    }
}

package level1.짝수와홀수;

public class Solution {

    public String solution(int num) {

        String answer = "";

        if(num==0){
            answer = "Even";
        }else if(num%2==0){
            answer = "Even";
        }else{
            answer = "Odd";
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int num = 3;
        String answer = solution.solution(num);
        System.out.println(answer);
    }
}

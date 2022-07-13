package level1.하샤드수;

import java.util.Arrays;
public class Solution {
    public boolean solution(int x) {
        boolean answer = true;

        String temp = String.valueOf(x);
        String[] arr = temp.split("");

        int sum = 0;
        for(String a : arr){
            sum+=Integer.parseInt(a);
        }

        if(x % sum == 0){
            answer = true;
        }else{
            answer = false;
        }


        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int x = 11;
        boolean answer = solution.solution(x);
        System.out.println(answer);
    }
}

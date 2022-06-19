package level1.두정수사이의합;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public long solution(int a, int b) {

        if(a==b) return a;

        if(a>b){
            int temp = a;
            a=b;
            b=temp;
        }

        long answer = 0;

        for(int i=a;i<=b;i++){
         answer+=i;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int a = 3;
        int b = 5;
        long answer = solution.solution(a,b);

        System.out.println(answer);
    }
}

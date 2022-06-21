package level1.문자열내p와y개수;

import java.util.*;

public class Solution {
    boolean solution(String s) {

        String temp = s.toLowerCase();
        int countY = 0;
        int countP = 0;
        
        char[] arr = temp.toCharArray();
        for (char a: arr) {
            if(a == 'y')countY++;
            else if (a == 'p') {
                countP++;
            }
        }
        
        if(countP == countY){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "pPoooyY";
        boolean answer = solution.solution(s);
        System.out.println(answer);
    }
}

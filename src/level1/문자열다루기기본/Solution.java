package level1.문자열다루기기본;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class Solution {

    public boolean solution(String s) {
        boolean answer = true;

        if(s.length() <=4 && s.length()<=6){
            for(int i=0;i<s.length();i++){
                if(Character.isLetter(s.charAt(i))) return false;
            }
        }else{
            return false;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "a234";
        boolean answer = solution.solution(s);
        System.out.println(answer);
    }
}

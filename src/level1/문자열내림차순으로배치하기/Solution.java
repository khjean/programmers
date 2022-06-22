package level1.문자열내림차순으로배치하기;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class Solution {

    public String solution(String s) {
        String upper="";
        String lower="";
        char[] arr = s.toCharArray();
        for(int i =0 ;i<arr.length;i++){
            if(Character.isLowerCase(arr[i])){
                lower+=arr[i];
            }else{
                upper+=arr[i];
            }
        }
        String[] up = upper.split("");
        String[] low = lower.split("");

        Arrays.sort(up, Collections.reverseOrder());
        Arrays.sort(low, Collections.reverseOrder());

        String answer = Arrays.stream(low).map(String::toString).collect(Collectors.joining())
                + Arrays.stream(up).map(String::toString).collect(Collectors.joining());
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "Zbcdefg";
        String answer = solution.solution(s);
        System.out.println(answer);
    }
}

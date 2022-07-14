package level1.핸드폰번호가리기;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {
    public String solution(String phone_number) {
        String b = phone_number.substring(phone_number.length()-4,phone_number.length());
        String a = phone_number.substring(0,phone_number.length()-4);
        if(a.length()!=0){
            a = Arrays.stream(a.split("")).map(s -> "*").collect(Collectors.joining());
        }
        String answer = a+b;
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String phone_number = "7777";
        String answer = solution.solution(phone_number);
        System.out.println(answer);
    }
}

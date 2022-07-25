package level2.문자열압축;

import java.util.Arrays;

public class Solution {
    public int solution(String s) {
        int answer = s.length();

        for(int i=1 ;i<=s.length() / 2 ;i++){
            int count = 1;
            String target = s.substring(0,i);
            String current = "";
            String finalSentence ="";

            for(int j=i ; j<=s.length() ; j+=i){
                if(j+i >= s.length()){
                    current = s.substring(j,s.length());
                }else{
                    current = s.substring(j,j+i);
                }

                if(target.equals(current)){
                    count++;
                }else if(count==1){
                    finalSentence+=target;
                    target = current;
                }else{
                    finalSentence+=String.valueOf(count);
                    finalSentence+=target;
                    target = current;
                    count=1;
                }

            }

            if(i != target.length()){
                finalSentence+=target;
            }
            answer = Math.min(finalSentence.length(),answer);

        }

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
//        String s = "aabbaccc";
//        String s = "ababcdcdababcdcd";
        String s = "abcabca";
        int answer = solution.solution(s);
        System.out.println(answer);

    }
}

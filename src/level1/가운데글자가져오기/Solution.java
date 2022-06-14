package level1.가운데글자가져오기;

public class Solution {
    public String solution(String s) {

        char[] arr = s.toCharArray();

        String answer="";
        if(arr.length % 2 != 0){
            answer += arr[arr.length/2];
        }else{
            answer += arr[(arr.length/2) -1];
            answer += arr[arr.length/2];
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "qwer";
        String answer = solution.solution(s);
        System.out.println(answer);
    }
}

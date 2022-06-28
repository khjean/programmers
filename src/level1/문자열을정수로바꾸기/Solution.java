package level1.문자열을정수로바꾸기;

public class Solution {

    public int solution(String s) {
        int answer = Integer.valueOf(s);
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "-1234";
        int answer = solution.solution(s);
        System.out.println(answer);
    }
}

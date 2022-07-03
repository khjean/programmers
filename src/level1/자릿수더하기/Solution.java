package level1.자릿수더하기;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        String temp = String.valueOf(n);
        String[] arr = temp.split("");

        for(String org : arr){
            answer+=Integer.valueOf(org);
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 123;
        int answer = solution.solution(n);
        System.out.println(answer);
    }
}

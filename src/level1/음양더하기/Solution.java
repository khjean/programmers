package level1.음양더하기;

public class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for(int i=0;i<absolutes.length;i++){
            answer = signs[i] ? answer+absolutes[i] : answer-absolutes[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] absolutes = {4,7,12};
        boolean[] signs = {true,false,true};
        int answer = solution.solution(absolutes,signs);
        System.out.println(answer);

    }
}

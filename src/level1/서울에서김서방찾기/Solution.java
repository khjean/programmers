package level1.서울에서김서방찾기;

public class Solution {

    public String solution(String[] seoul) {
        String x = "";

        for(int i=0;i<seoul.length;i++){
            if("Kim".equals(seoul[i])){
                x = String.valueOf(i);
                break;
            }
        }
        String answer = "김서방은 " + x + "에 있다";
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] seoul = {"Jane","Kim"};
        String answer = solution.solution(seoul);
        System.out.println(answer);
    }
}

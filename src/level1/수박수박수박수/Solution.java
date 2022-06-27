package level1.수박수박수박수;

public class Solution {

    public String solution(int n) {
        StringBuilder stringBuilder = new StringBuilder("");

        String temp = "수";
        for(int i=0;i<n;i++){
            if(i==0 || i%2 ==0){
                temp = "수";
            } else{
                temp = "박";
            }
            stringBuilder.append(temp);
        }

        String answer = stringBuilder.toString();
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 3;
        String answer = solution.solution(n);
        System.out.println(answer);
    }
}

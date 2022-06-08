package level1.이천십육년;

public class Solution {
    public String solution(int a, int b) {

        String[] strIndex = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int index = 4;

        for(int i=1;i<=12;i++){
            if(i==a){
                for(int j=1;j<=month[i-1];j++){
                    index++;
                    if(j==b) {
                        if(index > 6) index = index % 7;
                        return strIndex[index];
                    }
                }
            }
            index = (index + month[i-1]) % 7;
        }

        String answer = "";
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int a = 2;
        int b = 29;
        String answer = solution.solution(a,b);
        System.out.println(answer);
    }
}

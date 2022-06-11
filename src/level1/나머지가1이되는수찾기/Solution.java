package level1.나머지가1이되는수찾기;

public class Solution {
    public int solution(int n) {

        for(int i=2;i<n;i++){
            if(n%i == 1){
                return i;
            }
        }

        int answer = 0;
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 10;
        int answer = solution.solution(n);
        System.out.println(answer);
    }
}

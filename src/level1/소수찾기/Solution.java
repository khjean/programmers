package level1.소수찾기;

public class Solution {

    public int solution(int n) {
        int answer = 0;

        for(int i=2; i<=n;i++){
            if(findsosu(i)) answer++;
        }
        return answer;
    }
    public boolean findsosu(int n){
        boolean result = true;

        if(n==2) return true;
        for(int i =2;i<=Math.sqrt(n);i++){
            if(n % i == 0) return false;
        }

        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 10;
        int answer = solution.solution(n);
        System.out.println(answer);
    }
}

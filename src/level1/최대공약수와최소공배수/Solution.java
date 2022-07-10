package level1.최대공약수와최소공배수;

import java.util.Arrays;

public class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        //최대공약수, 최소공배수
        int temp1 = 1;
        int temp2 = 1;

        //최대공약수
        for(int i = Math.max(n,m) ; i>=0 ; i--){
            if(m % i == 0 && n % i == 0){
                temp1 = i;
                break;
            }
        }

        //최소공배수
        for(int i =Math.min(n,m) ; i<=n*m ; i++){
            if(i % m == 0 && i % n == 0){
                temp2 = i;
                break;
            }
        }

        answer[0] = temp1;
        answer[1] = temp2;

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 2;
        int m = 5;
        int[] answer = solution.solution(n, m);
        System.out.println(Arrays.toString(answer));
    }
}

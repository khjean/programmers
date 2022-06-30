package level1.약수의합;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int solution(int n) {
        List<Integer> yaksu = new ArrayList<>();

        for(int i=1;i<=n;i++){
            if(n % i == 0){
                yaksu.add(i);
            }
        }

        int answer = 0;

        for(int temp : yaksu){
            answer+=temp;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int n =0;
        int answer = solution.solution(12);

        System.out.println(answer);
    }
}

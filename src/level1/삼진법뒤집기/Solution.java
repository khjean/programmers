package level1.삼진법뒤집기;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int solution(int n) {

        //3진법 변환 11
        List<Integer> arr = new ArrayList<>();
        while(n>=1){
            arr.add(n%3);
            n = n/3;
        }

        int answer = 0;
        for(int i=0 ;i<arr.size();i++){
            answer+= Math.pow(3, i) * arr.get(arr.size()-1-i);
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int n=45;
        int answer = solution.solution(n);
        System.out.println(answer);
    }
}

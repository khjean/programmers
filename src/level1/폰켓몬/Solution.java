package level1.폰켓몬;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int solution(int[] nums) {

        int N = nums.length / 2;

        Set<Integer> temp = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            temp.add(nums[i]);
        }

        if(temp.size() > N){
            return N;
        }else if(temp.size() < N){
            return temp.size();
        }else{
            return N;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {3,1,2,3};
        int answer = solution.solution(nums);
        System.out.println(answer);
    }
}

package level1.같은숫자는싫어;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> temp = new ArrayList<>();
        int[] answer = {};

        for(int i=0;i<arr.length;i++){
            if(temp.size() > 0 && temp.get(temp.size()-1) == arr[i]){
                continue;
            }else{
                temp.add(arr[i]);
            }
        }

        answer = temp.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {1,1,3,3,0,1,1};
        int[] answer = solution.solution(arr);
        Arrays.stream(answer).forEach(System.out::println);
    }
}

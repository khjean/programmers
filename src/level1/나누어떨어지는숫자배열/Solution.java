package level1.나누어떨어지는숫자배열;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> temp = new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            if(arr[i] % divisor == 0){
                temp.add(arr[i]);
            }
        }
        if(temp.size() ==0){
            temp.add(-1);
        }

        int[] answer = temp.stream().sorted().mapToInt(Integer::intValue).toArray();
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {5,9,7,10};
        int divisor = 5;
        int[] answer = solution.solution(arr,divisor);
        Arrays.stream(answer).forEach(System.out::println);
    }
}

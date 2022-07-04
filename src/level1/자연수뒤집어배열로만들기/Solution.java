package level1.자연수뒤집어배열로만들기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int[] solution(long n) {
        String temp = String.valueOf(n);

        String[] arr = temp.split("");
        List<String> answer = new ArrayList<>();
        for(int i=arr.length-1;i>=0;i--){
            answer.add(arr[i]);
        }

        return answer.stream().mapToInt(Integer::valueOf).toArray();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        long n = 12345;
        int[] answer = solution.solution(n);
        System.out.println(Arrays.toString(answer));
    }
}

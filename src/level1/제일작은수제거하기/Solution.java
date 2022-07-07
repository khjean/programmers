package level1.제일작은수제거하기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public int[] solution(int[] arr) {
        if(arr.length == 1){
            return new int[]{-1};
        }

        List<Integer> temp = new ArrayList<>();

        int min = 999999999;
        int index = 0 ;
        for(int i =0 ; i<arr.length;i++){
            if(min > arr[i]){
                min = arr[i];
                index = i;
            }
            temp.add(arr[i]);
        }

        temp.remove(index);
        return temp.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {4,3,2,1};
        int[] answer = solution.solution(arr);
        System.out.println(Arrays.toString(answer));
    }
}

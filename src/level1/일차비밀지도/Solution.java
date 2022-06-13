package level1.일차비밀지도;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {

        List<String> resultMap = new ArrayList<>();
        for(int i=0;i<arr1.length;i++){
            int[] temp1 = convertTwonum(n,arr1[i]);
            int[] temp2 = convertTwonum(n,arr2[i]);

            String str = "";
            for(int j=0;j<temp1.length;j++){
                int sum = temp1[j] + temp2[j];
                if(sum==2 || sum==1){
                    str += "#";
                }else{
                    str += " ";
                }
            }
            resultMap.add(str);
        }

        String[] answer = resultMap.stream().toArray(String[]::new);
        return answer;
    }

    public int[] convertTwonum(int n, int num){

        Stack<Integer> stack = new Stack<>();
        int[] res = new int[n];

        while(num/2!=0){
            stack.push(num%2);
            num=num/2;
        }
        stack.push(num%2);

        int size = stack.size();
        if(stack.size() < n){
            for(int i=0;i<n-size;i++){
                stack.add(0);
            }
        }
        for(int i=0;i<n;i++){
            res[i] = stack.pop();
        }

        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};
        String[] answer = solution.solution(n, arr1, arr2);
        System.out.println(Arrays.stream(answer).collect(Collectors.toList()));
    }
}

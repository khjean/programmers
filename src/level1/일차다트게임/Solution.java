package level1.일차다트게임;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int solution(String dartResult) {

        char[] arr = dartResult.toCharArray();

        List<Integer> sum = new ArrayList<>();
        List<Integer> number = new ArrayList<>();
        List<Integer> letter = new ArrayList<>();
        List<Integer> plusbonusIndex = new ArrayList<>();
        List<Integer> minusbonusIndex = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(Character.isDigit(arr[i])){
                if(i+1<arr.length && Character.isDigit(arr[i+1])){
                    number.add(Character.getNumericValue(arr[i] + arr[i+1]));
                    ++i;
                }else{
                    number.add(Character.getNumericValue(arr[i]));
                }
            }else if(Character.isLetter(arr[i])){
                if(arr[i] == 'S'){
                    letter.add(1);
                } else if (arr[i]=='D') {
                    letter.add(2);
                }else{
                    letter.add(3);
                }
            }else{
                if(arr[i] == '*'){
                    int index = number.size()-1;
                    plusbonusIndex.add(index);
                    index-=1;
                    if(index>=0){
                        plusbonusIndex.add(index);
                    }
                }else{
                    int index = number.size()-1;
                    minusbonusIndex.add(index);
                }
            }
        }

        for(int i = 0 ;i<number.size();i++){
            int temp = (int) Math.pow(number.get(i),letter.get(i));
            sum.add(temp);
        }

        for(int i=0;i<plusbonusIndex.size();i++){
            sum.set(plusbonusIndex.get(i) , 2*sum.get(plusbonusIndex.get(i)));
        }

        for(int i=0;i<minusbonusIndex.size();i++){
            sum.set(minusbonusIndex.get(i) , -1*sum.get(minusbonusIndex.get(i)));
        }

        int answer = 0;

        for(int i=0;i<sum.size();i++){
            answer+= sum.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String dartResult = "1D2S#10S";
        int answer = solution.solution(dartResult);
        System.out.println(answer);
    }
}

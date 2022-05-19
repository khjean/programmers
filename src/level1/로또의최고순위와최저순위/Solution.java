package level1.로또의최고순위와최저순위;

import java.util.*;

public class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];

        Set<Integer> lottosSet = new HashSet<>();
        for(int i=0;i< lottos.length;i++){
            if(lottos[i]!=0){
                lottosSet.add(lottos[i]);
            }
        }

        int zeroCount = lottos.length - lottosSet.size();

        int wincount = 0;
        for(int i=0;i< win_nums.length;i++){
            if(lottosSet.contains(win_nums[i])) wincount++;
        }

        int highCount = wincount + zeroCount;
        int lowCount = wincount;

        Map<Integer,Integer> convertRank = new HashMap<>();
        convertRank.put(6,1);
        convertRank.put(5,2);
        convertRank.put(4,3);
        convertRank.put(3,4);
        convertRank.put(2,5);

        if(convertRank.containsKey(highCount)){
            answer[0] = convertRank.get(highCount);
        }else {
            answer[0] = 6;
        }

        if(convertRank.containsKey(lowCount)){
            answer[1] = convertRank.get(lowCount);
        }else {
            answer[1] = 6;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
//        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] lottos = {0, 0, 0, 0, 0, 0};
//        int[] win_nums = {31, 10, 45, 1, 6, 19};
        int[] win_nums = {38, 19, 20, 40, 15, 25};
        int[] answer = solution.solution(lottos,win_nums);
        Arrays.stream(answer).forEach(System.out::println);


    }
}

package level2.기능개발;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};

        List<Integer> deploys = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();

        for(int i = 0 ;i<progresses.length;i++){
            int temp = progresses[i];
            int days = 0;
            while(temp<100){
                temp+=speeds[i];
                days++;
            }
            deploys.add(days);
        }

        System.out.println(deploys.toString());

        int group = 0;
        int temp2 = deploys.get(0);
        for(int i=0 ;i<deploys.size();i++){
            if(temp2 >= deploys.get(i)){
                group++;
            }else{
                ans.add(group);
                temp2 = deploys.get(i);
                group=1;
            }
        }
        ans.add(group);

        return ans.stream().mapToInt(Integer::intValue).toArray();
    }


    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] progresses = {93, 30, 55};
//        int[] progresses = {98,99,98,99};
//        int[] progresses = {95, 90, 99, 99, 80, 99};
        int[] speeds = {1, 30, 5};
//        int[] speeds = {1, 1, 1,1};
//        int[] speeds = {1, 1, 1, 1, 1, 1};


        int[] answer = solution.solution(progresses, speeds);

        System.out.println(Arrays.toString(answer));

    }
}

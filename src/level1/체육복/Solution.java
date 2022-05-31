package level1.체육복;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int solution(int n, int[] lost, int[] reserve) {

        Map<Integer, Integer> map = new HashMap<>();
        for(int i=1;i<=n;i++){
            map.put(i,1);
        }

        for(int i=0;i<lost.length;i++){
            map.put(lost[i], map.get(lost[i])-1);
        }

        for(int i=0;i< reserve.length;i++){
            map.put(reserve[i],map.get(reserve[i])+1);
        }
        
        for(int i=1 ; i<=n ; i++){
            if(i+1<=n && map.get(i) == 2 && map.get(i+1) == 0){
                map.put(i,map.get(i)-1);
                map.put(i+1,map.get(i+1)+1);
            }
            if(i+1<=n && map.get(i) == 0 && map.get(i+1) == 2){
                map.put(i,map.get(i)+1);
                map.put(i+1,map.get(i+1)-1);
            }
            if (i-1>=1 && map.get(i-1) ==2 && map.get(i)==0) {
                map.put(i,map.get(i)+1);
                map.put(i-1,map.get(i-1)-1);
            }
            if (i-1>=1 && map.get(i-1) ==0 && map.get(i)==2) {
                map.put(i,map.get(i)-1);
                map.put(i-1,map.get(i-1)+1);
            }
        }

        int answer = 0;
        for(int i=1 ; i<=n;i++){
            if(map.get(i) >=1) answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int n =5;
        int[] lost = {2,4};
        int[] reserve = {3};
        int answer = solution.solution(n,lost,reserve);
        System.out.println(answer);
        //5
    }
}

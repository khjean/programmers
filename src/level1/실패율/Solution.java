package level1.실패율;

import java.util.*;

public class Solution {

//    실패율은 다음과 같이 정의한다.
//    스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수 / 스테이지에 도달한 플레이어 수

    public int[] solution(int N, int[] stages) {
        Map<Integer, Double> failrateMap = new HashMap<>();
        for(int i=1;i<=N;i++){
            int currentPlayer = 0;
            int notclearPlayer = 0;

            for(int j=0;j< stages.length;j++){
                if(i <= stages[j]){
                    ++currentPlayer;
                }
                if(i == stages[j]) ++notclearPlayer;
            }

            if(currentPlayer ==0){
                failrateMap.put(i,0.0);
            }else{
                failrateMap.put(i,(double) notclearPlayer / currentPlayer);
            }

        }

        List<Integer> keySet = new ArrayList<>(failrateMap.keySet());
        Collections.sort(keySet,(value1, value2) -> failrateMap.get(value2).compareTo(failrateMap.get(value1)));

        int[] answer = keySet.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int N = 5;
        int[] stages = {2,1,2,6,2,4,3,3};
        int[] answer = solution.solution(N,stages);
        Arrays.stream(answer).forEach(System.out::println);
    }
}

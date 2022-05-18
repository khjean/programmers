package level1.신고결과받기;

import java.util.*;

public class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];

        Map<String, Integer> indexMap = new HashMap<>();
        Map<String, Set<String>> blackMail = new HashMap<>();

        for(int i = 0;i< id_list.length;i++){
            indexMap.put(id_list[i],i);
            blackMail.put(id_list[i],new HashSet<>());
        }

        for(int i=0;i< report.length;i++){
            String start = report[i].split(" ")[0];
            String end = report[i].split(" ")[1];

            blackMail.get(end).add(start);

        }

        for(int i=0;i< id_list.length;i++){
            if(blackMail.get(id_list[i]).size() >=k){

                blackMail.get(id_list[i]).forEach(value -> {
                    answer[indexMap.get(value)]++;
                });
            }
        }

        return answer;
    }


//    ["muzi", "frodo", "apeach", "neo"]
//    ["muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"]
//    2
//    [2,1,1,0]
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k =2;
        int[] ans = solution.solution(id_list, report, k);
        Arrays.stream(ans).forEach(System.out::println);
    }
}

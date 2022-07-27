package level2.오픈채팅방;

import java.util.*;

public class Solution {
    public String[] solution(String[] record) {

        Map<String, String> map = new HashMap<>();
        List<String> answer = new ArrayList<>();
        for(int i=0;i< record.length;i++){
            String temp = record[i];

            if(temp.contains("Enter") || temp.contains("Change")){
                String[] arr = temp.split(" ");
                map.put(arr[1], arr[2]);
            }

        }

        for(int i=0;i< record.length;i++){
            String temp = record[i];
            String[] arr = temp.split(" ");

            String nwSentence = "";
            if("Enter".equals(arr[0])){
                nwSentence += map.get(arr[1])+"님이 들어왔습니다.";
                answer.add(nwSentence);

            }else if("Leave".equals(arr[0])){
                nwSentence += map.get(arr[1])+"님이 나갔습니다.";
                answer.add(nwSentence);
            }
        }

        return answer.stream().toArray(String[]::new);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
//        ["Prodo님이 들어왔습니다.", "Ryan님이 들어왔습니다.", "Prodo님이 나갔습니다.", "Prodo님이 들어왔습니다."]
        String[] answer = solution.solution(record);
        System.out.println(Arrays.toString(answer));

    }
}

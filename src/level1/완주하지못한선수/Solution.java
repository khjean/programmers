package level1.완주하지못한선수;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public String solution(String[] participant, String[] completion) {
        List<String> listParticipant = Arrays.stream(participant).sorted().collect(Collectors.toList());
        List<String> listCompletion = Arrays.stream(completion).sorted().collect(Collectors.toList());

        for(int i = 0;i<listCompletion.size();i++){
            if(!listParticipant.get(i).equals(listCompletion.get(i))){
                return listParticipant.get(i);
            }
        }

        String answer = listParticipant.get(listParticipant.size()-1);
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};
        String answer = solution.solution(participant, completion);
        System.out.println(answer);

    }
}

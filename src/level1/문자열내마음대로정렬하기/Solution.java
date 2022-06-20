package level1.문자열내마음대로정렬하기;

import java.util.*;

public class Solution {
    public String[] solution(String[] strings, int n) {
        Map<Integer,Character> map = new HashMap<>();

        for (int i =0;i< strings.length;i++){
            char[] temp = strings[i].toCharArray();

            for(int j=0;j<temp.length;j++){
                if(j==n){
                    map.put(i,temp[j]);
                    break;
                }
            }
        }

        List<Map.Entry<Integer,Character>> entryList = new LinkedList<>(map.entrySet());
        entryList.sort(Map.Entry.comparingByValue());

        for(int i=0;i<entryList.size();i++){
            for(int j=i+1 ; j<entryList.size();j++){
                if(entryList.get(i).getValue() == entryList.get(j).getValue()){
                    if(strings[entryList.get(i).getKey()].compareTo(strings[entryList.get(j).getKey()])>0){
                        Map.Entry<Integer,Character> temp = entryList.get(i);
                        entryList.set(i , entryList.get(j));
                        entryList.set(j, temp);
                    }
                }
            }
        }

        String[] answer = new String[entryList.size()];

        for(int i=0;i<entryList.size();i++){
            answer[i] = strings[entryList.get(i).getKey()];
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

//        String[] strings = {"sun", "bed", "car"};
//        String[] strings = {"abce", "abcd", "cdx"};
        String[] strings = {"baac", "baab", "baaa"};
        int n = 0;
        String[] answer = solution.solution(strings,n);

        System.out.println(Arrays.toString(answer));
    }
}

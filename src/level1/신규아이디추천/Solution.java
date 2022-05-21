package level1.신규아이디추천;

import java.util.*;

public class Solution {

//1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
//2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
//3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
//4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
//5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
//6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
//만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
//7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.

    public String solution(String new_id) {
        //1단계
        new_id = new_id.toLowerCase();
        //2단계
        new_id = new_id.replaceAll("[^a-z0-9_.-]","");
        //3단계
        new_id = new_id.replaceAll("[.]{2,}",".");
        //4단계 -> new_id = new_id.replaceAll("^[.]|[.]$",""); 이걸로도 가능
        if(new_id.startsWith(".")){
            char[] temp = new_id.toCharArray();
            char[] new_temp = new char[temp.length-1];
            for (int i=0;i<new_temp.length;i++){
                new_temp[i] = temp[i+1];
            }
            new_id = String.valueOf(new_temp);
        }
        if(new_id.endsWith(".")){
            char[] temp = new_id.toCharArray();
            char[] new_temp = new char[temp.length-1];
            for (int i=0;i<new_temp.length;i++){
                new_temp[i] = temp[i];
            }
            new_id = String.valueOf(new_temp);
        }
        //5단계
        if(new_id.length()==0){
            new_id = "a";
        }
        //6단계
        if(new_id.length() >= 16){
            char[] temp = new_id.toCharArray();
            char[] new_temp = new char[15];
            for(int i=0;i<new_temp.length;i++){
                new_temp[i] = temp[i];
            }
            if(new_temp[14] == '.'){
                new_id = String.valueOf(new_temp,0,14);
            }else{
                new_id = String.valueOf(new_temp);
            }
        }
        //7단계
        if(new_id.length()<=2){
            char lastChar = new_id.charAt(new_id.length()-1);
            while(new_id.length() != 3) {
                new_id += lastChar;
            }
        }

        return new_id;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String new_id = "...!@BaT#*..y.abcdefghijklm";
        String answer = solution.solution(new_id);
        System.out.println(answer);

    }
}

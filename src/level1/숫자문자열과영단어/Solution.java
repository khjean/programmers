package level1.숫자문자열과영단어;

public class Solution {

//    1478 → "one4seveneight"
//    234567 → "23four5six7"
//    10203 → "1zerotwozero3"
    public int solution(String s) {

        for(int i=0;i<10;i++){
            String source="";
            switch (i){
                case 0:
                    source = "zero";
                    break;
                case 1:
                    source = "one";
                    break;
                case 2:
                    source = "two";
                    break;
                case 3:
                    source = "three";
                    break;
                case 4:
                    source = "four";
                    break;
                case 5:
                    source = "five";
                    break;
                case 6:
                    source = "six";
                    break;
                case 7:
                    source = "seven";
                    break;
                case 8:
                    source = "eight";
                    break;
                case 9:
                    source = "nine";
                    break;
            }

            s = s.replaceAll(source,String.valueOf(i));
        }

        int answer = Integer.valueOf(s);
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int answer = solution.solution("1zerotwozero3");
        System.out.println(answer);

    }
}

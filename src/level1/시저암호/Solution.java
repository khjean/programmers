package level1.시저암호;

public class Solution {

    public String solution(String s, int n) {

        char[] arr = s.toCharArray();

        for(int i=0;i<arr.length;i++){
            if((int) arr[i] == 32) continue;

            if(Character.isLowerCase(arr[i]) && arr[i]+n > 122){
                arr[i] = (char) (arr[i]+n-26);
            }else if(Character.isUpperCase(arr[i]) && arr[i]+n > 90){
                arr[i] = (char) (arr[i]+n-26);
            }else{
                arr[i] = (char) (arr[i]+n);
            }

        }

        String answer = String.valueOf(arr);
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "a B z";
        int n = 4;
        String answer = solution.solution(s, n);
        System.out.println(answer);
    }
}

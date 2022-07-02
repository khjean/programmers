package level1.이상한문자만들기;

public class Solution {
    public String solution(String s) {
        char[] arr = s.toCharArray();

        int temp = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == ' '){
                temp = 0;
                continue;
            }

            if(temp == 0 || temp % 2 == 0){
                arr[i] = Character.toUpperCase(arr[i]);
                temp++;
            }else {
                arr[i] = Character.toLowerCase(arr[i]);
                temp++;
            }
        }

        String answer = String.valueOf(arr);
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "try hello world";
        String answer = solution.solution(s);
        System.out.println(answer);
    }
}

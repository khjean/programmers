package level2.일이사나라의숫자;

public class Solution {

    public String solution(int n) {
        String answer = "";

        String[] numbers = {"4","1","2"};

        while(n > 0){
            int newN = n % 3;
            n = n / 3;

            if(newN == 0) n--;

            answer = numbers[newN] + answer;
        }


        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int n = 1;

        String answer = solution.solution(n);

        System.out.println(answer);

    }
}

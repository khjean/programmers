package level1.콜라츠추측;

public class Solution {

//    1-1. 입력된 수가 짝수라면 2로 나눕니다.
//    1-2. 입력된 수가 홀수라면 3을 곱하고 1을 더합니다.
//    2. 결과로 나온 수에 같은 작업을 1이 될 때까지 반복합니다.
    public int solution(int num) {
        int answer = 0;
        if(answer == 1) return 0;

        long numTemp = num;
        while(answer<=500){
            ++answer;
            if(numTemp % 2 == 0){
                numTemp = numTemp/2;
            }else{
                numTemp = (numTemp*3)+1;
            }
            if(numTemp == 1) return answer;
        }

        answer = -1;
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int num = 626331;
        int answer = solution.solution(num);
        System.out.println(answer);
    }
}

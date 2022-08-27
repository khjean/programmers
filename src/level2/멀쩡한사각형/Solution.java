package level2.멀쩡한사각형;

public class Solution {

    public long solution(int w, int h) {
        long answer = 1;

        long convW = Long.parseLong(String.valueOf(w));
        long convH = Long.parseLong(String.valueOf(h));

        long maxyaksu = 1;
        for(long i=Math.max(convH,convW);i>=0;i--){
            if(convH % i == 0 && convW % i ==0){
                maxyaksu = i;
                break;
            }
        }

        answer = ((convW * convH) - (convW + convH - maxyaksu));

        return answer;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();

        int w = 8;
        int h = 12;

        long answer = solution.solution(w, h);

        System.out.println(answer);

    }
}

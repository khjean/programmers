package level1.최소직사각형;

public class Solution {
    public int solution(int[][] sizes) {

        int garoMax = 0;
        int seroMax = 0;

        for(int i=0;i<sizes.length;i++){

            if(sizes[i][0] < sizes[i][1]){
                int temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;

            }

            garoMax = Math.max(garoMax,sizes[i][0]);
            seroMax = Math.max(seroMax,sizes[i][1]);
        }
        return garoMax*seroMax;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
//        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        int[][] sizes = {{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}};
        int answer = solution.solution(sizes);
        System.out.println(answer);
    }
}

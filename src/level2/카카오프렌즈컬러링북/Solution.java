package level2.카카오프렌즈컬러링북;

import java.util.Arrays;

public class Solution {
    int numberOfArea = 0;
    int maxSizeOfOneArea = 0;
    int area = 0;
    //상하좌우
    int[] dx = {-1,1,0,0};
    int[] dy = {0,0,-1,1};

    public void dfs (int i, int j, int[][] picture, boolean[][] visit){
        if(visit[i][j]){
            return;
        }

        visit[i][j] = true;
        area++;

        for(int k=0;k<4;k++){
            int nx = dx[k]+i;
            int ny = dy[k]+j;

            if(nx < 0 || nx >= picture.length || ny < 0 || ny >= picture[0].length) continue;

            if(picture[i][j] == picture[nx][ny] && !visit[nx][ny]){
                dfs(nx,ny,picture,visit);
            }

        }

    }

    public int[] solution(int m, int n, int[][] picture) {

        int[] answer = new int[2];
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;

        boolean[][] visit = new boolean[m][n];


        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(picture[i][j]==0 || visit[i][j]) continue;

                numberOfArea++;
                dfs(i,j,picture,visit);

                maxSizeOfOneArea = Math.max(maxSizeOfOneArea,area);
                area = 0;
            }
        }

        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;

        return answer;
    }

//    1 1 1 0
//    1 2 2 0
//    1 0 0 1
//    0 0 0 1
//    0 0 0 3
//    0 0 0 3

    public static void main(String[] args) {
        Solution solution = new Solution();
        int m = 6;
        int n = 4;
        int[][] picture = {{1, 1, 1, 0}, {1, 2, 2, 0}, {1, 0, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 3}, {0, 0, 0, 3}};

        int[] answer = solution.solution(m,n,picture);
        System.out.println(Arrays.toString(answer));

    }
}

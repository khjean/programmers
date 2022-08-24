package level2.단체사진찍기;

public class Solution {
    private int answer = 0;
    private String[] friendsname = {"A", "C", "F", "J", "M", "N", "R", "T"};

    public int solution(int n, String[] data) {
        boolean[] visited = new boolean[8];
        dfs("",visited, data);
        return answer;
    }

    public void dfs(String name, boolean[] visited, String[] data){
        if(name.length()==8){
            //조건에 맞는지 체크
            if(check(name, data)){
                answer++;
            }
            return;
        }
        for(int i=0 ;i<8;i++){
            if(visited[i] == false){
                visited[i] = true;
                String names = name + friendsname[i];
                dfs(names,visited,data);
                visited[i]=false;
            }
        }
    }

    public boolean check(String name, String[] data){
        boolean chk = true;
        for(String temp : data){
            int pos1 = name.indexOf(temp.charAt(0));
            int pos2 = name.indexOf(temp.charAt(2));
            int wantPos = Character.getNumericValue(temp.charAt(4))+1;
            if(temp.charAt(3) == '>'){
                if(Math.abs(pos1 - pos2) <= wantPos) return false;
            }else if(temp.charAt(3) == '<'){
                if(Math.abs(pos1 - pos2) >= wantPos) return false;
            }else if(temp.charAt(3) == '='){
                if(Math.abs(pos1 - pos2) != wantPos) return false;
            }
        }

        return chk;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();

        int n = 2;
        String[] data = {"N~F=0","R~T>2"};

        int answer = solution.solution(n, data);

        System.out.println(answer);

    }
}

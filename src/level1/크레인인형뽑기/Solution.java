package level1.크레인인형뽑기;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
    public int solution(int[][] board, int[] moves) {

        List<Stack<Integer>> stackBoard = new ArrayList<>();
        Stack<Integer> stackPang = new Stack<>();
        for(int i = 0 ;i < board.length; i++){
            Stack<Integer> tempStack = new Stack<>();
            for(int j=board[i].length-1 ; j>=0;j--){
                if(board[j][i]!=0) tempStack.add(board[j][i]);
            }
            stackBoard.add(tempStack);
        }

        int answer = 0;
        for(int i=0;i< moves.length;i++){
            if(stackPang.size()> 0 && stackBoard.get(moves[i]-1).size() > 0 && (stackPang.peek() == stackBoard.get(moves[i]-1).peek())){
                stackPang.pop();
                stackBoard.get(moves[i]-1).pop();
                answer+=2;
            }else if(stackBoard.get(moves[i]-1).size()>0){
                stackPang.add(stackBoard.get(moves[i]-1).pop());
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};

        int answer = solution.solution(board, moves);
        System.out.println(answer);

    }
}

package level1.부족한금액계산하기;

public class Solution {
    public long solution(int price, int money, int count) {

        long total = 0;
        for (int i=1;i<=count;i++){
            total+=(i*price);
        }

        long answer = money-total;
        if(answer < 0){
            return Math.abs(answer);
        }else{
            return 0;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int price = 3;
        int money = 20;
        int count = 4;
        long answer = solution.solution(price,money,count);
        System.out.println(answer);
    }
}

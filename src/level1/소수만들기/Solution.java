package level1.소수만들기;

public class Solution {
    int answer = 0;
    public int solution(int[] nums) {
        boolean[] visited = new boolean[nums.length];
        combination(nums,visited,0,nums.length,3);
        return answer;
    }

    public void combination(int[] nums,boolean[] visited, int start, int n, int r){
        if(r==0){
            int sum =0;
            for(int i=0;i<n;i++){
                if(visited[i]){
                    sum+=nums[i];
                }
            }

            if (isPrime(sum)) answer++;
        } else{
            for(int i=start; i<n ; i++){
                visited[i] = true;
                combination(nums,visited,i+1,n,r-1);
                visited[i] = false;
            }
        }
    }

    public boolean isPrime(int num) {
        if(num<=1) return false;

        int a = (int) Math.sqrt(num);
        for (int i = 2; i <= a; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3, 4};
        int answer = solution.solution(nums);
        System.out.println(answer);
    }
}

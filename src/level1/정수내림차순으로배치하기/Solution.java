package level1.정수내림차순으로배치하기;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Solution {
    public long solution(long n) {
        String temp = String.valueOf(n);
        String orderdString = Arrays.stream(temp.split("")).sorted(Comparator.reverseOrder()).collect(Collectors.joining());

        long answer = Long.valueOf(orderdString);
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        long n = 118372;
        long answer = solution.solution(n);
        System.out.println(answer);
    }
}

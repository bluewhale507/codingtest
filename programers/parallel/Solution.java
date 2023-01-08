package programers.parallel;

import java.util.Arrays;

class Solution {
    public int solution(int[][] dots) {
        int answer = 0;

        for(int dot1[] : dots) {
            System.out.println(Arrays.toString(dot1));
        }
        return answer;
    }
}

class SolutionEx {
    public static void main(String[] args) {
        int[][] dots = {{1, 4}, {9, 2}, {3, 8}, {11, 6}};

        Solution sol = new Solution();

        sol.solution(dots);
    }
}
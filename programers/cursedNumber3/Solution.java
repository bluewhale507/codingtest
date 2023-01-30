package programers.cursedNumber3;

import java.util.Arrays;

class Solution {
    public int solution(int n) {
        int[] base_3x = new int[n+1];
        int answer = 0, j = 0;
        for(int i=0;i<n+1;i++){
            base_3x[i] = j;
            j++;
            while(j%3==0 || String.valueOf(j).contains("3")){
                j++;
            }
        }
        return base_3x[n];
    }
}

class SolutionEx {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(100));
    }
}
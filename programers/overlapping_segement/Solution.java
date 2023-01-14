package programers.overlapping_segement;

import java.util.Arrays;

class Solution {
    public int solution(int[][] lines) {
        int[] arr = new int[201];
        int answer = 0;
        for (int[] line : lines) {
            int a = line[0] + 100;
            int b = line[1] + 100;
            while (a<=b) {
                if (++arr[a++] == 2) answer++;
                System.out.println(Arrays.toString(arr));
            }
        }
        answer--;
        return answer;
    }
}

class SolutionEx {
    public static void main(String[] args) {
        int[][] arr1 = {{0,1},{2,5},{3,9}};
        int[][] arr2 = {{0,5},{3,9},{1,10}};
        Solution sol = new Solution();

        System.out.println(sol.solution(arr2));
    }
}
package programers.sum_of_consecutive_number;

import java.sql.SQLOutput;
import java.util.Arrays;

class Solution {
    public int[] solution(int num, int total) {
        int add = 0;
        int x = 0;
        int[] answer = new int[3];

        for(int i=0;i<num;i++){ add += i; }
        x = (total - add)/num;
        for(int i=0;i<num;i++){ answer[i] = x+i;}
        return answer;

    }
}

class SolutionEx {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.solution(3,12)));
    }
}
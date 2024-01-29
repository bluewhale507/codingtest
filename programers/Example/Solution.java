package programers.Example;

import java.util.Scanner;

class Solution {
    public int solution(int[] num_list) {
        int mult = 1;
        int sum = 0;
        int answer = 0;

        for(int i : num_list){
            sum += i;
            mult *= i;
        }

        answer = Math.pow(sum,2) > mult ? 1 : 0;

        return answer;
    }
}

class SolutionEx {
    public static void main(String[] args){
        Solution sol = new Solution();
        System.out.println(sol.solution(new int[] {3,4,5,2,1}));
    }
}
package programers.Example;
<<<<<<< HEAD
import java.util.Arrays;

public class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = Arrays.copyOf(arr, arr.length);

        for(int[] row : queries) {
            int i = row[0];
            int j = row[1];

            int temp = answer[i];
            answer[i] = answer[j];
            answer[j] = temp;
        }
        return answer;
    }
}
=======

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
>>>>>>> f5babe6c5db8cf26716c224e107c318ad71b7e9e

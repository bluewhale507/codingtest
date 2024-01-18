package programers.Example;

import java.util.Scanner;

public class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";

        for (int i = 0; i < my_string.length(); i++) {
            char currentChar = my_string.charAt(i);

            if (i < s || i >= s + overwrite_string.length()) {
                answer += currentChar;
            } else {
                 answer += overwrite_string;
                 i += overwrite_string.length() - 1;
            }
        }
        System.out.println(answer);

        return answer;
    }
}

class SolutionEx {
    public static void main(String[] args){
        Solution sol = new Solution();
        System.out.println(sol.solution("He11oWor1d","lloworl",2));
    }
}
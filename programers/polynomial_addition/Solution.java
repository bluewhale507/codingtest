package programers.polynomial_addition;

import java.util.Arrays;


class Solution {
    public String solution(String polynomial) {
        String[] terms = polynomial.split(" ");
        String answer = "";
        int sumX = 0, sumConstant = 0;

        for(String term : terms) {
            if(term.endsWith("x")){
                term = term.replace("x", "");
                if(term.isEmpty()) term = term.replace("", "1");
                sumX += Integer.parseInt(term);
            } else {
                try {
                    sumConstant += Integer.parseInt(term);
                } catch (Exception e) { }
            }
        }
        if(sumX == 0) {
                    switch (sumConstant) {
                        case 0:
                            answer += sumConstant;
                            break;
                        default:
                            answer += sumConstant;
                            break;
                    }
        }else {
            switch(sumX) {
                case 1:
                    answer += "x";
                    break;
                default:
                    answer += sumX+"x";
            }
            switch (sumConstant) {
                case 0:
                    break;
                default:
                    answer += " + "+sumConstant;
                    break;
            }
        }
        return answer;
    }
}

class SolutionEx {
    public static void main(String[] args) {
        String test1 = "10 + 19 + x";
        String test2 = "x + x + x";
        String test3 = "3x + 8 + 9x";
        String test4 = "5x + 3x + 1 + 10 + 3x + 5";
        String test5 = "10 + 25";
        Solution sol = new Solution();

        System.out.println(sol.solution(test5));
    }
}
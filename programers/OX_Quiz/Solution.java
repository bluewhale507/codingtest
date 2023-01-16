package programers.OX_Quiz;

import java.util.Arrays;

class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];

        for(int i=0;i<quiz.length;i++){
            int [] number = new int[3];
            String[] fragments = quiz[i].split(" ");
            //문자표현식의 숫자 정수로 타입변환
            for(int j=0;j<fragments.length;j+=2){ number[j/2] = Integer.parseInt(fragments[j]); }
            //연산기호에 따른 연산후 배열에 삽입
            switch (fragments[1]) {
                case "-":
                    if(number[0] - number[1] == number[2])
                        answer[i] = "O";
                    else
                        answer[i] = "X";
                    break;
                case "+":
                    if(number[0] + number[1] == number[2])
                        answer[i] = "O";
                    else
                        answer[i] = "X";
                    break;
            }
        }
        return answer;
    }
}

class SolutionEx {
    public static void main(String[] args) {
        String[] quiz = {"3 - 4 = -3", "5 + 6 = 11"};
        Solution sol = new Solution();

        System.out.println(Arrays.toString(sol.solution(quiz)));
    }
}
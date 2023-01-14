package programers.parallel;

import java.lang.reflect.Array;
import java.util.Arrays;

class Solution {
    //test case의 좌표수가 4개 => 배열 조합 가짓수 n(n-1)/2 이므로 6
    public static double[] leans = new double[6];
    public int solution(int[][] dots) {
        double lean = 0;
        int answer = 0;
        int combinationCount = 0;

        //비교할 dot1과 dot2의 경우의 수 조합
        for(int i=0; i<dots.length-1; i++) {
            for(int j=i+1; j<dots.length; j++) {
                lean = (double)(dots[i][1] - dots[j][1]) / (dots[i][0] - dots[j][0]);
                //모든 경우의 수의 기울기를 담은 배열
                leans[combinationCount++] = lean;
            }
        }
        //n번째 항과 6(leans배열의 길이)-n항의 값이 같다면 평행
        for(int i=0; i<leans.length; i++) {
            if (leans[i] == leans[(leans.length - 1) - i]) answer = 1;
        }
        return answer;
    }
}

class SolutionEx {
    public static void main(String[] args) {
        int[][] dots = {{1, 4}, {9, 2}, {3, 8}, {11, 6}};

        Solution sol = new Solution();

        System.out.println(sol.solution(dots));
    }
}
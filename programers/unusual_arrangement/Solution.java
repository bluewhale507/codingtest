package programers.unusual_arrangement;

import java.util.Arrays;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] difference = new int[numlist.length];
        int temp = 0;

        //입력한 n과의 차를 저장한 배열
        for(int i=0; i<numlist.length; i++) difference[i] = numlist[i] - n;

        //선택정렬
        for(int i=0; i<difference.length; i++) {
            for(int j=i+1; j<difference.length; j++) {
                if(Math.abs(difference[i]) > Math.abs(difference[j])) {
                    temp = difference[i];
                    difference[i] = difference[j];
                    difference[j] = temp;
                    System.out.println(difference[i]);
                }
            }
            //입력값과의 차이가 같은경우 큰수가 앞에 오도록 함.
            for(int j=i+1; j<difference.length; j++) {
                if (Math.abs(difference[i]) == Math.abs(difference[j])) {
                    difference[i] = (difference[i] > difference[j]) ? difference[i] : difference[j];
                    difference[j] = -difference[i];
                }
            }
            difference[i] += n;
        }
        return difference;
    }
}

class SolutionEx {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] numlist1 = {1,2,3,4,5,6};
        int[] numlist2 = {10000,20,36,47,40,6,10,7000};

        System.out.println(Arrays.toString(sol.solution(numlist2,30)));
    }
}
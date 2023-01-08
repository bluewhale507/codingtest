package programers.next_Elements;

class Solution {
    public int solution(int[] common) {
        int answer = 0, difference = 0;

        //common[3]-common[2] == common[2] - common[1]을 이항한 표현식.
        //등차수열이 아니면 곧 등비수열으로 판단.
        if(common[0]+common[2] == 2 * common[1]) {
            difference = common[2] - common[1];
            answer = common[common.length-1] + difference;
        } else {
            difference = common[2] / common[1];
            answer = common[common.length-1] + difference;
        }


        return answer;
    }
}

class solutionEx{
    public static void main(String[] args) {

    }
}
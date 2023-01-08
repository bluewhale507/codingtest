package programers.babbling_1;

class Solution {

    public static String[] arr = {"aya", "ye", "woo", "ma"};

    public int solution(String[] babbling) {
        int answer = 0;

        for(String babble : babbling) {
            for(String e : arr) {
               babble = babble.replace(e," ");
            }
            if(babble.isBlank()) answer++;
        }
        return answer;
    }
}

class SolutionEx {
    public static void main(String[] args) {

        String[] test1 = {"aya", "yee", "u", "maa", "wyeoo"};
        String[] test2 = {"ayaye", "uuuma", "yeye", "yemawoo", "ayaa"};

        Solution sol = new Solution();

        System.out.println(sol.solution(test2));
    }
}
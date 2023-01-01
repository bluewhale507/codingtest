package programers;

class Solution {

    public int solution(String t, String p) {
        //t의 길이 최대 10000자리, p의 길이 최대 18자리
        int answer = 0;
        long tValue = 0, pValue = 0;
        int tLength = t.length();
        int pLength = p.length();

        //첫번째 문자열을 2번째 문자열 크기로 잘라서 부분 문자열 생성
        try {
            for(int i=0; i<tLength-pLength+1; i++) {
                tValue = Long.parseLong(t.substring(i, i + pLength));
                pValue = Long.parseLong(p);
                if(tValue <= pValue) answer++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException!");
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException!");
        }

        return answer;
    }
}
class SolutionEx {
    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.solution("10203","15");

    }
}
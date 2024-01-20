package programers.shuffle_strings;

class Solution {
    public String solution(String str1, String str2) {

        String answer = "";
        /*
        int length = str1.length();

        for(int i=0;i<length;i++){
            //answer += String.valueOf(str1.charAt(i)) + str2.charAt(i);
            answer += str1.charAt(i);
            answer += str2.charAt(i);
        }
        return answer;
        */
/*        String[] strArr1 = str1.split("");
        String[] strArr2 = str2.split("");
//        char[] charArr1 = str1.toCharArray();
//        char[] charArr2 = str2.toCharArray();

        for (int i=0; i<str1.length();i++){
            answer += strArr1[i]+strArr2[i];
//            answer += (String.valueOf(charArr1[i]) + charArr2[i]);
        }
        return answer;*/
        StringBuilder sb = new StringBuilder();

        char[] charArr1 = str1.toCharArray();
        char[] charArr2 = str2.toCharArray();

        for(int i=0; i<charArr1.length;i++){
            sb.append(charArr1[i]).append(charArr2[i]);
        }
        return sb.toString();
    }
}

class SolutionEx {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(new String("aaaa"),new String("bbbb")));
    }
}

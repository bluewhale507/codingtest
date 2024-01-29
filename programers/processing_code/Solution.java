package programers.processing_code;

class Solution {
    public String solution(String code) {
        String answer = "";
        String ret = "";
        int mode = 0;
        char[] arr = code.toCharArray();

        for(int i=0;i<arr.length;i++) {
            switch(mode){
                case 0:
                    if(arr[i] != '1'){
                        ret += (i % 2 == 0) ? arr[i] : "";
                        System.out.println("mode 0 : "+ret);
                        break;
                    }else{
                        mode = 1;
                        break;
                    }
                case 1:
                    if(arr[i] != '1'){
                        ret += (i % 2 == 1) ? arr[i] : "";
                        System.out.println("mode 1 : "+ret);
                        break;
                    }else{
                        mode = 0;
                        break;
                    }
            }
        }
        return answer += (ret.isBlank()) ? "EMPTY" : ret;
    }
}

class SolutionEx {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution("abc1abc1abc"));
    }
}
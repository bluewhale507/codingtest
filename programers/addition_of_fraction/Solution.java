package programers.addition_of_fraction;

import java.util.Arrays;

class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];

        //최대공약수
        int gcd = gcd(denom1, denom2);
        System.out.println("gcd : "+gcd);
        //최소공배수 = 두수의 곱 / 최대공약수
        int lcm = denom1*denom2 / gcd(denom1, denom2);
        System.out.println("lcm : "+lcm);
        //최소 공배수를 이용하여 통분
        numer1 *= lcm/denom1;
        numer2 *= lcm/denom2;
        System.out.println("numer1:"+numer1+", "+"numer2:"+numer2);
        //분수의 덧셈
        int result = numer1 + numer2;
        //분모와 분자의 최대 공약수를 이용하여 기약분수 만들기
        gcd = gcd(result,lcm);
        if(result%gcd==0 && lcm%gcd==0) {
            answer[0] = result / gcd;
            answer[1] = lcm / gcd;
        } else {
            answer[0] = result;
            answer[1] = lcm;
        }

        return answer;
    }

    private int gcd(int a, int b) {
        //0의 공약수는 모든수 > 어떤수 x와의 최대공약수는 어떤수 x자기자신
        if(a==0 || b==0)
            return Math.max(a,b);
        else {
            int i = Math.min(a,b);
            while(true) {
                if(a%i==0 && b%i==0)
                    return i;
                i--;
            }
        }
    }
}

class SolutionEx {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.solution(1,12,3,36)));
    }
}
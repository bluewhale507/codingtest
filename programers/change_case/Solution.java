package programers.change_case;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String result = "";

        //자바에서 String 객체는 인덱스로 접근불가능 charAt() 인스턴스 메서드를 이용한다.
        for(int i=0;i<a.length();i++){
            char curChar = a.charAt(i);
            if(Character.isUpperCase(curChar)){
                result += Character.toLowerCase(curChar);
            } else {
                result += Character.toUpperCase(curChar);
            }
        }
    }



}

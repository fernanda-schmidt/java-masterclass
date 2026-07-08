package section06;

import javax.swing.*;

/*
Write a method called isPalindrome with one int parameter called number.
The method needs to return a boolean.
It should return true if the number is a palindrome number otherwise it should return false.
 */
public class exercise01 {
    static void main() {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
    }

    public static boolean isPalindrome(int num){
        int posNum = Math.abs(num);
        int originalNum = posNum;
        int reversed = 0;
        while (posNum > 0 ){
            int lastDigit = posNum % 10;
            reversed = reversed * 10 + lastDigit;
            posNum = posNum / 10;
        }
        return originalNum == reversed;

    }
}

package com.Khushan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


//we can use the inbuilt .reverse() method to solve the problem but our goal here was to develop a logic
//
public class Palindrome {
    public boolean isPalindrome(int x) {
        int temp = x, sum=0,remainder;
        while(x>0){
            remainder = x%10;
            sum=(sum*10)+remainder;
            x = x/10;
        }
        if(sum==temp)
            return true;
        else return false;
    }
    public static void main(String[] args) {
        Palindrome obj = new Palindrome();
        System.out.println(obj.isPalindrome(121));
    }

}
//another way to make it work
//Scanner scan = new Scanner(System.in);
//        int num = scan.nextInt();
//        String string = Integer.toString(num);
//        int[] reverseArray = new int[string.length()];
//        int i=0;
//        while(num>0){
//            reverseArray[i]=num%10;
//            num%=10;
//            i++;
//        }
//        String reverseNumString = Arrays.toString(reverseArray);
//        if(string.equals(reverseNumString))
//            System.out.println("Number is a palindrome");
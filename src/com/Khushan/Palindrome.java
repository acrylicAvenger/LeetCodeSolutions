package com.Khushan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


//we can use the inbuilt .reverse() method to solve the problem but our goal here was to develop a logic
//
public class Palindrome {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        String string = Integer.toString(num);
        int[] reverseArray = new int[string.length()];
        int i=0;
        while(num>0){
            reverseArray[i]=num%10;
            num%=10;
            i++;
        }
        String reverseNumString = Arrays.toString(reverseArray);
        if(string.equals(reverseNumString))
            System.out.println("Number is a palindrome");
    }


//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int number = scan.nextInt();
//        //we will check if the number is palindrome or not
//        String numberString;
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        numberString = Integer.toString(number);
//        while (number > 0) {
//            int temp = number;
//            arrayList.add(temp % 10);
//            temp /= 10;
//        }
//
//        numberString = arrayList.toString();
//        if (numberString.equals(Integer.toString(number))) {
//            System.out.println("The number is a palindrome");
//        }
//    }
}
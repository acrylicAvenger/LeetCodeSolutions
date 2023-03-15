package com.Khushan;

//You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
//
//You may assume the two numbers do not contain any leading zero, except the number 0 itself.
//
//
//
//Example 1:
//Input: l1 = [2,4,3], l2 = [5,6,4]
//Output: [7,0,8]
//Explanation: 342 + 465 = 807.

import java.util.LinkedList;

public class LinkedListAddition {
    public LinkedList addTwoNumbers (LinkedList l1, LinkedList l2){
        String s1 = l1.toString();
        String s2 = l2.toString();
        int num1 = Integer.parseInt(s1);
        int num2 = Integer.parseInt(s2);
        int num3 = num1+num2;
        LinkedList <Integer> answerList = new LinkedList<>();
        while(num3!=0){
            int temp = num3%10;
            answerList.add(temp);
            num3/=10;
        }
        return answerList;
    }
    public static void main(String[] args) {

    }
}

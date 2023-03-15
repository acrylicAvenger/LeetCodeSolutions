package com.Khushan;

import java.beans.PropertyEditorSupport;
import java.util.HashMap;

//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//You can return the answer in any order.
public class twoSum {
    public int[] twoSum(int[] nums, int target) {

// ******************************************************************************************************
//        brute force gives us the following result but we want better than O(n^2) time complexity
//        int[] resultArray = new int[2];
//        int sum=0;
//        for(int i=0;i< nums.length;i++){
//            for(int j=i+1;j< nums.length;j++){
//                sum += nums[i];
//                if(sum==target){
//                    resultArray=new int[]{i,j};
//                }
//            }
//        }
//        return resultArray;
//   ****************************************************************************************************
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        int[] answerArray = new int[2];
        for(int i=0;i< nums.length;i++){
            if(hashMap.containsKey(target-nums[i])){
                answerArray[0]=i;
                answerArray[1]=hashMap.get(target-nums[i]);
                return answerArray;
            }
            hashMap.put(nums[i],i);
        }
        return answerArray;
    }
    public static void main(String[] args) {

    }
}

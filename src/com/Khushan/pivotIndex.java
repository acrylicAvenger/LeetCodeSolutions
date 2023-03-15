package com.Khushan;

public class pivotIndex {
    public int solution(int[] nums){
        int leftSum=0,totalSum=0;
        //iteration for pivot-index
        for (int i=0;i< nums.length;i++){
            totalSum+=nums[i];
        }
        for(int j=0;j< nums.length;j++){
            if(j!=0)
                leftSum+=nums[j-1];
            if ((totalSum - leftSum - nums[j]) == leftSum)
                return j;

        }
        return -1;
    }
    public static void main(String[] args) {

    }
}

package array.questions;

import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {
        int[] arr = {1,2,4,6,4,6,4,6};
        int target =10;
        System.out.println("the sum of "+ Arrays.toString(twoSum(arr,target))+ " is "+target);

    }


    public static int[] twoSum(int[] nums, int target) {

        for(int i = 0 ; i<nums.length; i++){
            for(int j = i+1; j<nums.length; j++){
                if(nums[i]+nums[j] == target){
                    int[] arr = {nums[i],nums[j]};
                    return arr;
                }
            }

        }

        return null;
    }
}

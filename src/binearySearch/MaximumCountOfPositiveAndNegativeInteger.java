package binearySearch;


/*
problem url :https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer/

problem statement :
        Given an array nums sorted in non-decreasing order,
        return the maximum between the number of positive integers and the number of negative integers.

In other words, if the number of positive integers in nums is pos and the number of negative integers is neg,
then return the maximum of pos and neg.

Note that 0 is neither positive nor negative.
 */

public class MaximumCountOfPositiveAndNegativeInteger {

    public int maximumCount(int[] nums) {

        /*
        logic or algo:
         we use two bineary search , one to find the last neg number and one for first postive number
         from the beginning upto the last negative number all are negetive so count the number of negative
         similaritly from the first possitive number all the elements till the end are possitive , so count the positive
        intergers numbers
         return the maximum count;
         */

        int n = nums.length;

        int negIdx = -1;//represent where the neg values ended
        int posIdx = -1;// represent from where the pos values started

        // finding the last occurance of negetive number
        int low = 0;
        int high = n - 1;

        while(low <= high){

            int mid = (low + high)/2;

            // if zero or greater value then search left as we need small vlaue
            if(nums[mid] >= 0 ){
                // reduce the search space and search in left
                high = mid - 1;
            }else{
                //update the index as it can be a possible result
                negIdx = mid;
                // now search on the right if there are any more negative vlaue or not
                low = mid + 1 ;

            }
        }


        //find the first occurrence of possitive value
        low = 0;
        high = n - 1;

        while(low <= high){

            int mid = (low + high)/2;

            // if zero or lesser value , search right as we need small vlaue
            if(nums[mid] <= 0 ){
                // reduce the search space and search in left
                low = mid + 1;
            }else{
                //update the index as it can be a possible result
                posIdx = mid;
                // now search on the left if there are any small possitive vlaue or not
                high = mid - 1 ;

            }
        }


        int negCount = 0;
        int posCount = 0;
        if(negIdx >= 0 ){
            negCount = negIdx + 1;
        }
        if(posIdx >= 0 ){
            posCount = n - posIdx;
        }

        return (negCount > posCount)?negCount:posCount;

    }

}

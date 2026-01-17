package binearySearch;

/*
problem url: https://leetcode.com/problems/find-smallest-letter-greater-than-target/

problem statement:
       You are given an array of characters letters that is sorted in non-decreasing order,
       and a character target. There are at least two different characters in letters.

Return the smallest character in letters that is lexicographically greater than target.
If such a character does not exist, return the first character in letters.

 */

public class FindSmallestLetterGreaterThanTarget {

    public char nextGreatestLetter(char[] letters, char tar) {

        char nextLetter = letters[0] ;


        int low = 0;
        int high = letters.length - 1;

        while(low <= high){

            int mid = (low + high)/2;

            // if we get the target or it is smaller than target
            if(letters[mid] <= tar){
                //go right;
                low = mid +1;
            }
            //check if mid > target
            else{
                //update the largetst character value
                nextLetter = letters[mid];
                //go left
                high = mid - 1;
            }
        }

        return nextLetter;
    }
}

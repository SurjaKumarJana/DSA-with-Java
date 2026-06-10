package stack;

import java.util.Stack;

/*
problem url: https://leetcode.com/problems/number-of-visible-people-in-a-queue/
 */
public class NumberOfVisiblePeopleInAQueue {
    public int[] canSeePersonsCount(int[] heights) {
        int n = heights.length;
        Stack<Integer> stack = new Stack<>();

        for(int i = n-1; i>=0; i--){
            int count = 0;
            //remove all the small values
            while(!stack.isEmpty() && stack.peek()<=heights[i]){
                //increase count
                count++;
                //remove element
                stack.pop();
            }
            if(!stack.isEmpty()) count++;

            stack.push(heights[i]);

            //add the count to the resulting array
            heights[i] = count;

        }


        return heights;
    }
}

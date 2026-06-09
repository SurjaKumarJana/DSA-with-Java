package stack;

/*
problem url: https://leetcode.com/problems/next-greater-element-ii/
 */

import java.util.Stack;

public class NextGreaterElement2 {
    public int[] nextGreaterElements(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];

        Stack<Integer> stack = new Stack<Integer>();

        //put all the element of array in the stack in reverse order (means: from n-1 to 0)
        for(int i = n-1; i>=0; i--){
            stack.push(arr[i]);
        }


        for(int i = n-1 ; i>=0; i--){
            //remove all the smaller values from top
            while(!stack.isEmpty() && stack.peek()<=arr[i]){
                stack.pop();
            }
            //push the top as it is the next greater value
            // if the stack is empty that means there are no greater values
            ans[i]=(stack.isEmpty())?-1:stack.peek();
            stack.push(arr[i]);
        }


        return ans;
    }

}

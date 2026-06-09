package stack;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

/*
problem url: https://www.geeksforgeeks.org/problems/next-larger-element-1587115620/1
 */
public class NextGreaterElement {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> result = new ArrayList<>(n);
        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }


            result.add(stack.isEmpty() ? -1 : stack.peek());
            stack.push(arr[i]);
        }

        // fix the order at the end
        Collections.reverse(result);
        return result;
    }

}

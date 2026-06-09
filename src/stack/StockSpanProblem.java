package stack;

import java.util.ArrayList;
import java.util.Stack;

/*
problem url: https://www.geeksforgeeks.org/problems/stock-span-problem-1587115621/1
 */

public class StockSpanProblem {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        int n =arr.length;
        ArrayList<Integer> span= new ArrayList<>();

        // this stack holds the indeices of the elements not the actual values
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<n; i++){
            //remove all the small values from the top
            while(!stack.isEmpty() && arr[stack.peek()]<=arr[i]){
                stack.pop();
            }
            // for 0th index and for the largest element,
            // we can not get stack.peek(),
            // so we have to calculate span from the beginning
            if(stack.isEmpty()) span.add(i-(-1));
            else span.add(i-stack.peek());

            stack.push(i);
        }

        return span;
    }
}

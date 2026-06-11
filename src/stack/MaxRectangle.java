package stack;

import java.util.Stack;

/*
problem url: https://www.geeksforgeeks.org/problems/max-rectangle/1
 */
public class MaxRectangle {
    static int maxArea(int[][] arr) {

        int row = arr.length;//number of rows
        int col = arr[0].length; //number of columns

        for(int i = 1; i<row; i++){
            for(int j = 0; j<col; j++){
                if(arr[i][j] == 1) arr[i][j] +=arr[i-1][j];
            }
        }

        int maxArea = 0;

        //iterate through each row and find maxArea of this histogram
        //in bottom to a top direction;
        for(int i = row-1; i>=0 ;i--){
            int area = largestRectangleArea(arr[i]);
            if(area>maxArea) maxArea = area;
        }

        return maxArea;
    }



    static int largestRectangleArea(int[] arr) {

        int n = arr.length;

        //to store the indices of next smaller values
        int[] nextSVs = new int[n];
        //to store the indices of previous smaller values
        int[] prevSVs = new int[n];

        Stack<Integer> stack = new Stack<>();

        //finding the next smaller values for each histogram
        for(int i = n-1; i>= 0; i--){
            //remove all the bigger values
            while(!stack.isEmpty() && arr[stack.peek()] >= arr[i]){
                stack.pop();
            }

            nextSVs[i] = (stack.isEmpty())? n: stack.peek();
            stack.push(i);
        }

        //removing all the elements from the stack
        stack.clear();

        //finding the previous smaller values for each histogram
        for(int i = 0; i < n; i++){
            //remove all the bigger values
            while(!stack.isEmpty() && arr[stack.peek()] >= arr[i]){
                stack.pop();
            }

            prevSVs[i] = (stack.isEmpty())? -1: stack.peek();
            stack.push(i);
        }


        //iterate through the area array and find the max area
        int maxArea = 0;
        for(int i = 0 ; i<n; i++){
            int area = arr[i]*(nextSVs[i] - prevSVs[i] - 1);
            if(area>maxArea) maxArea = area;
        }

        return maxArea;
    }
}

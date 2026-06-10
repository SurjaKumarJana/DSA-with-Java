package stack;

import java.util.Stack;

/*
problem url: https://www.geeksforgeeks.org/problems/the-celebrity-problem/1
 */
public class TheCelebrityProblem {
    public int celebrity(int arr[][]) {

        int n = arr.length;
        Stack<Integer> stack = new Stack<>();

        //inserting all the indices of elements
        for(int i =0; i<n; i++) stack.push(i);

        while(stack.size() > 1){

            int a = stack.pop();
            int b = stack.pop();

            //a knows b, so a is not  celeb
            if(arr[a][b] == 1) {
                stack.push(b);
            }
            else {
                //b knows a, so b is not  celeb
                stack.push(a);
            }

        }

        // now if the stack is empty then there are no celeb
        if(stack.isEmpty()) return -1;

        int celeb = stack.pop();

        //check the columns, if any one doesn't known celeb, this element is not a celeb
        for(int j = 0; j<n; j++){
            if (j == celeb) continue;
            if(arr[j][celeb] == 0) return -1;
        }

        //check the row , if this element knows anyone, this element is not a celeb
        for(int i = 0; i<n; i++){
            if(i == celeb) continue;
            if(arr[celeb][i] == 1) return -1;
        }

        return celeb;

    }
}

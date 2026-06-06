package stack;

import java.util.Stack;

/*
problem url: https://leetcode.com/problems/baseball-game/
 */

public class BaseballGame {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();

        for(int i =0;i<operations.length;i++){
            String operation = operations[i];
            insertPoint(operation,stack);
        }

        int ans = 0;
        while(!stack.isEmpty()){
            ans += stack.pop();
        }

        return ans;
    }
    public void insertPoint(String operation,Stack<Integer> stack) {
        switch (operation){
            case "C":
                if(!stack.isEmpty()){stack.pop();}
                break;
            case "D":
                int top = stack.peek();
                stack.push(top*2);
                break;
            case "+":
                int top1 = stack.pop();
                int top2 = stack.peek();
                stack.push(top1);
                stack.push(top1+top2);
                break;
            default:
                stack.push(Integer.parseInt(operation));
        }
    }
}

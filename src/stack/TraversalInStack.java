package stack;

import java.util.Stack;

public class TraversalInStack {
    public static void main(String[] args) {
        Stack<Integer> nums = new Stack<>();
        nums.push(10);
        nums.push(20);
        nums.push(30);
        nums.push(40);
        nums.push(50);

        //printStackTopToBottom(nums);
        printStackBottomToTop(nums);

    }

    static void printStackTopToBottom(Stack<Integer> stack){
        //axillary space
        Stack<Integer> helperStack = new Stack<>();

        while(!stack.isEmpty()){
            Integer val = stack.pop();
            System.out.print(val+" ");
            helperStack.push(val);
        }

        while(!helperStack.isEmpty()){
            stack.push(helperStack.pop());
        }

        System.out.println();
    }

    static void printStackBottomToTop(Stack<Integer> stack){

        //axillary space
        Stack<Integer> helperStack = new Stack<>();

        while(!stack.isEmpty()){
            Integer val = stack.pop();
            helperStack.push(val);
        }
        while(!helperStack.isEmpty()){
            Integer val = helperStack.pop();
            System.out.print(val+" ");
            stack.push(val);

        }
        System.out.println();
    }
}

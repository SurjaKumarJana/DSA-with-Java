package stack;


import java.util.Stack;

public class ReverseStack {

    public static void main(String[] args) {
        Stack<Integer>  stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.push(70);

        System.out.println("initial  stack :"+stack);
        reverse(stack);
        System.out.println("reversed stack :"+stack);
    }


    //time complexity == O(n) and axillary space complexity == O(n)
    static void reverse(Stack<Integer> stack){
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        //it will move all the element to stack1 in reverse order
        while(!stack.isEmpty()){
            stack1.push(stack.pop());
        }

        //now this loop will copy the initial stack
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }

        // finally adding the elements into initial stack in reverse order
        while (!stack2.isEmpty()){
            stack.push(stack2.pop());
        }
    }
}

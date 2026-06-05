package stack;

public class SampleClass {
    public static void main(String[] args) {
        StackUsingLinkedList stack = new StackUsingLinkedList();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.push(70);
        stack.printStack();
        stack.pop();
        stack.printStack();
        System.out.println("current  top :"+ stack.peek());
        System.out.println("current size :"+stack.size());
    }
}

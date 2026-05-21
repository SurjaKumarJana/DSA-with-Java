package stack;

import java.util.Stack;

public class GetElementAtIndex {
    public static void main(String[] args) {

        //Stack data structure
        Stack<String> companies = new Stack<>();
        //adding element in the stack
        companies.push("samsung");
        companies.push("lava");
        companies.push("apple");
        companies.push("sony");

        //method to get element at a specific index
        System.out.println(getElementAt(companies,2));
    }

    public static String getElementAt(Stack<String> stack , int idx){
        if(idx>stack.size()) return "invalid index";
        Stack<String> helperStack = new Stack<>();

        //zero index based stack
        while(stack.size()>idx+1){
            helperStack.push(stack.pop());
        }
        String value = stack.pop();
        helperStack.push(value);
        while(!helperStack.isEmpty()){
            stack.push(helperStack.pop());
        }


        return value;
    }
}

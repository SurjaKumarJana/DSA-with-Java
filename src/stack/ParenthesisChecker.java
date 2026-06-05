package stack;


import java.util.Stack;

/*
problem url: https://www.geeksforgeeks.org/problems/parenthesis-checker2744/1
 */
public class ParenthesisChecker {

    public boolean isBalanced(String s) {
        int n = s.length();

        if(n==0) return true;
        //odd length means invalid
        if(n%2 != 0) return false;


        Stack<Character> stack = new Stack<>();



        int idx = 0;

        while(idx<n){
            Character curr = s.charAt(idx);

            //if it is opening parentheses the push into stack
            if(curr=='(' || curr=='{' || curr=='[') stack.push(curr);
            else{
                if(stack.isEmpty()) return false;
                else{
                    Character top = stack.peek();
                    //for closing parentheses check the top is it pair or not
                    if(isPair(curr,top)) stack.pop();
                    else return false;
                }
            }

            idx++;
        }

        if(stack.isEmpty()) return true;


        return false;
    }
    public boolean isPair(Character curr, Character top) {
        if(curr==')' && top == '(') return true;
        else if(curr=='}' && top == '{') return true;
        else if(curr==']' && top == '[') return true;
        else return false;
    }

}

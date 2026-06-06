package stack;


import java.util.Stack;

/*
problem url: https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/
 */
public class RemoveAllAdjacentDuplicatesInString {
    public String removeDuplicates(String s) {

        int n = s.length();

        Stack<Character> stack = new Stack<>();

        for(int i = 0;i<n;i++){
            //current character
            Character curr = s.charAt(i);

            // if stack is empty then push current character
            if(stack.isEmpty()) {stack.push(curr);}
            else{
                Character top = stack.peek();
                // if current char is equals to top then remove the top
                if(curr == top) {stack.pop();}
                //push the new char
                else{stack.push(curr);}
            }

        }
        String ans = "";

        while(!stack.isEmpty()){
            ans = stack.pop()+ans;
        }

        return ans;
    }

}

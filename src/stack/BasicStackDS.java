package stack;

import java.util.Stack;

public class BasicStackDS {
    public static void main(String[] args) {

        //Stack data structure
        Stack<String> companies = new Stack<>();

        //adding element in the stack
        companies.push("samsung");
        companies.push("lava");
        companies.push("apple");
        companies.push("sony");

        //removing elements from top as stack follows the LIFO principle
        companies.pop();
        companies.pop();

        //peeking the element in the top
        System.out.println(companies.peek());

        //to know the size of the stack
        System.out.println(companies.size());

    }
}

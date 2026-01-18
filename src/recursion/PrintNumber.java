package recursion;

// this is an example to understand recursion
public class PrintNumber {
    public static void main(String[] args) {
        int n = 10;
        print(n);// calling a recursive function to print 1 to n
    }
    public static void print(int x){

        if(x == 0) return; // base case

        // we can also have some work before calling the function
        print(x - 1); // function calling

        System.out.println(x + " "); // work
    }
}

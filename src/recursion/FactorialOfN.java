package recursion;

public class FactorialOfN {

    public static void main(String[] args) {
        int n = 6;
        int factorialOfN = factorial(n);
        System.out.println("Factorial of "+ n +" : "+ factorialOfN);
    }
    public static int factorial(int x ){

        if(x==0 || x==1 ) return 1;

        int result = x * factorial(x-1);

        return result;
    }
}

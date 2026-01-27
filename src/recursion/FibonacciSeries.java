package recursion;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(n+"th term in Fibonacci series : "+fibonacci(n));
    }

    public static int fibonacci(int n){
        if(n<=1) return n;

        return fibonacci(n-1)+fibonacci(n-2);
    }
}
//0 1 1 2 3 5 8 13 21 34 55
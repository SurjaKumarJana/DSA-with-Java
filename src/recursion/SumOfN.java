package recursion;

public class SumOfN {
    public static void main(String[] args) {
        int number = 6;
        System.out.println("Sum of first "+number+ " is : "+sum(number));
    }
    public static int sum(int n){
        if(n == 1){
            return 1;
        }

        return n+sum(n-1);
    }
}

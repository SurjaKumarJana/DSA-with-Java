package recursion;

public class ReverseNumber {

    public static void main(String[] args) {
        int number = 1234567;
        System.out.println("reverse of "+number+" is : "+ reverse(number,0));
    }
    public static int reverse(int n,int r){
        if(n==0){
            return r;
        }
        return reverse(n/10,(r*10+n%10));
    }

}

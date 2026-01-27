package recursion;

public class FindLCM {

    public static void main(String[] args) {
        int a =12, b=16;

        System.out.println("LCM of "+a+" "+ b +" is : "+lcm(a,b));

    }
    public static int lcm(int a, int b){
        // formula of LCM = a*b/gcd(a,b);
        return a*b/gcd(a,b);
    }
    public static int gcd(int a,int b){
        if(a==0) return b;
        return gcd(b%a,a);
    }
}

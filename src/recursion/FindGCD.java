package recursion;

public class FindGCD {

    public static void main(String[] args) {
        int a =12;
        int b =16;
        System.out.println("GCD : "+ gcd(a,b));
    }

    //time complexity o(min(a,b))
//    public static int gcd(int a, int b){
//        int hcf = 1;
//        for(int i = 1; i<Math.min(a,b);i++){
//            if(a%i == 0 && b%i == 0) {
//                hcf = i;
//            }
//        }
//        return hcf;
//    }
    //time complexity o(log(min(a,b))
    public static int gcd(int a, int b) {
        if(a==0) return b;
        return gcd(b%a,a);
    }

}

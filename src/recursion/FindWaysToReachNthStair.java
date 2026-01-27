package recursion;


//max 2 steps allowed

public class FindWaysToReachNthStair {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Number of possible ways: "+findWays(n));
    }
    public static int findWays(int n){
        if(n<=2) return n;
        return findWays(n-1)+findWays(n-2);
    }
}

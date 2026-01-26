package recursion;

/*
find the ans of a^b using recursion
 */
public class ARaiseToB {

    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        System.out.println(3 +" raise to "+4+" is : "+ pow(3,4) );
    }

    // time complexity o(n)
//    public static int pow(int a, int b){
//        if(b == 0) return 1;
//        return a*pow(a,b-1);
//    }

    // time complexity o(log n)
    public static int pow(int a, int b){
        if(b == 1) return a;
        int ans = pow(a,b/2);
        if(b%2 == 0){
            return ans*ans;
        }

        return a*ans*ans;
    }
}

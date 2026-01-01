package string;


/*
step :
use two pointer approach , if the values at this pointers are not equal then it  is not palindrome
 */


public class PalindromeString {
    public static void main(String[] args) {
        String s1 = "aabbaa";

        System.out.println(isPalindrome(s1));

    }

    public  static  boolean isPalindrome(String s) {
        int left =0;
        int right = s.length()-1;

        while(left<right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }

            left++;
            right --;
        }


        return true;
    }
}

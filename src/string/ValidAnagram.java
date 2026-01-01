package string;

import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        String s1 = "talent";
        String s2 = "latent";

        System.out.println(isAnagram(s1,s2));

    }

    public static boolean isAnagram(String s, String t) {
        int n = s.length();
        int m = t.length();

        if(n!=m){
            return false;
        }

        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1,arr2)){
            return true;
        }

        return false;

    }
}

package recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/*
problem url: https://www.geeksforgeeks.org/problems/power-set4302/1

problem statement:
       Given a string s of length n, find all the possible non-empty subsequences of the string s
       in lexicographically-sorted order.

Example 1:

Input :
s = "abc"
Output:
a ab abc ac b bc c
Explanation :
There are a total 7 number of subsequences possible for the given string, and they are mentioned
above in lexicographically sorted order.
Example 2:

Input:
s = "aa"
Output:
a a aa
Explanation :
There are a total 3 number of subsequences possible for the given string, and they are
mentioned above in lexicographically sorted order.
Your Task:
You don't need to read input or print anything. Your task is to complete the function AllPossibleStrings()
which takes a string s as the input parameter and returns a list of all possible subsequences (non-empty)
that can be formed from s in lexicographically sorted order.

Expected Time Complexity: O( n*2n  )
Expected Space Complexity: O( n * 2n )

Constraints:
1 <= n <= 16
s constitutes of lower case english alphabets
 */

public class PowerSet {

    public static void main(String[] args) {
        String s = "abc";
        System.out.println(allPossibleStrings(s).toString());
    }
    public static List<String> allPossibleStrings(String s) {

        List<String> result = new ArrayList<>();
        findSubStrings("", s, 0, result);
        Collections.sort(result);
        return result;

    }


    public static void findSubStrings(String ans, String str, int idx, List<String> substrings){

        if(idx == str.length()){
            if(ans.length() !=0) {
                substrings.add(ans);
            }
            return;
        }
        char currentChar = str.charAt(idx);
        findSubStrings(ans+currentChar, str, idx+1, substrings);//pick char
        findSubStrings(ans, str, idx+1, substrings);//drop char
    }
}

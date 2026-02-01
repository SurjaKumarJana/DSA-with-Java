package recursion;


/*
problem url: https://www.geeksforgeeks.org/problems/decode-the-pattern1138/1

problem statement:
       Given an integer n. Return the nth row of the following look-and-say pattern.
1
11
21
1211
111221
Look-and-Say Pattern:

To generate a member of the sequence from the previous member, read off the digits of the previous member,
counting the number of digits in groups of the same digit. For example:

1 is read off as "one 1" or 11.
11 is read off as "two 1s" or 21.
21 is read off as "one 2, then one 1" or 1211.
1211 is read off as "one 1, one 2, then two 1s" or 111221.
111221 is read off as "three 1s, two 2s, then one 1" or 312211.
Examples:

Input: n = 5
Output: 111221
Explanation: The 5th row of the given pattern will be 111221.
Input: n = 3
Output: 21
Explanation: The 3rd row of the given pattern will be 21.
 */
public class LookAndSayPattern {
    public String countAndSay(int n) {

        //base case
        if(n == 1) return "1";

        //recursive call to get the previous string
        String s = countAndSay(n-1) +"#";

        int i=0, j=0;
        int l = s.length();
        //resulting string
        String ans ="";

        //reading the string and finding the pattern
        while(j < l){
            if(s.charAt(i) == s.charAt(j)) j++;
            else{
                int freq = j-i;
                ans += freq;
                ans += s.charAt(i);

                // moving the window
                i = j;
            }
        }


        return ans;
    }
}

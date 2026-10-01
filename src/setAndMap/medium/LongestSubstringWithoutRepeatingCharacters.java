package setAndMap.medium;
/*
problem url: https://leetcode.com/problems/longest-substring-without-repeating-characters/
 */


import java.util.HashSet;

/*      solution using HashMap, TC = O(n), SC --> O(n)
    -------------------------------------------        */
public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();

        int i=0, j=0;
        int maxLen = 0;
        while(j<s.length()){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
            }
            else{
                int currLen = j-i;
                if(currLen>maxLen) maxLen = currLen;

                while(s.charAt(i) != s.charAt(j)){
                    set.remove(s.charAt(i));
                    i++;
                }
                i++;
            }
            j++;
        }
        int currLen = j-i;
        if(currLen>maxLen) maxLen = currLen;

        return maxLen;
    }
}

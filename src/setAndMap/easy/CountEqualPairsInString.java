package setAndMap.easy;

/*
problem url: https://www.geeksforgeeks.org/problems/count-number-of-equal-pairs-in-a-string0520/1
 */


import java.util.HashMap;

/*      solution using HashMap, TC = O(n), SC --> O(n)
    -------------------------------------------        */
public class CountEqualPairsInString {
    public int equalPairs(String s) {
        HashMap<Character, Integer> map = new HashMap();
        for(int i=0; i<s.length(); i++) {map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);}

        int count = 0;
        for(char c : map.keySet()){count += map.get(c)*map.get(c);}
        return count;
    }
}

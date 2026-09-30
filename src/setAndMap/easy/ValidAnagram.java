package setAndMap.easy;

/*
problem url: https://leetcode.com/problems/valid-anagram/
 */


import java.util.HashMap;

/*      solution using HashMap, TC = O(n), SC --> O(n)
    -------------------------------------------        */
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        //inserting elements into hashmaps.... O(n)
        for(int i=0; i<s.length(); i++){map1.put(s.charAt(i), map1.getOrDefault(s.charAt(i),0)+1);}
        for(int i=0; i<s.length(); i++){map2.put(t.charAt(i), map2.getOrDefault(t.charAt(i),0)+1);}

        //traversing elements of hashmaps.... O(n)
        for(char x : map1.keySet()){if(!map1.get(x).equals(map2.get(x))) return false;}

        return true;
    }
}

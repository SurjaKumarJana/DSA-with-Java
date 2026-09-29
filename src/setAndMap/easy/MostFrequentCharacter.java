package setAndMap.easy;

/*
problem url: https://www.geeksforgeeks.org/problems/maximum-occuring-character-1587115620/1
 */


import java.util.HashMap;

/*      solution using HashMap, TC = O(n), SC --> O(n)
    -------------------------------------------        */
public class MostFrequentCharacter {
    public static char getMaxOccuringChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        //calculating the frequency...... TC == O(n)
        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                int freq = map.get(c);
                map.put(c,freq+1);
            }
            else{
                map.put(c,1);
            }
        }

        int maxFreq = 0;
        //calculating the max frequency...... TC == O(n)
        for(char c : map.keySet()){
            if(map.get(c) > maxFreq){
                maxFreq = map.get(c);
            }
        }

        //calculating the char with max frequency...... TC == O(n)
        char freqChar = 'z';
        for(char c : map.keySet()){
            if(map.get(c) == maxFreq)
                freqChar = (c<freqChar)? c : freqChar;
        }

        return freqChar;

    }
}

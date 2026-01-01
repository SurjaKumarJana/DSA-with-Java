package string;

public class MostFrequentCharacter {
    public static void main(String[] args) {
        String str = "ccaareers";
        System.out.println(getMaxOccuringChar(str));
    }

    public static char getMaxOccuringChar(String s){
        int n = s.length();
        int[] freq = new int[26];
        //interate to update the freq of chars
        for(int i =0; i<n ;i++){
            int idx = s.charAt(i) -'a';
            freq[idx] ++;
        }

        //find the max freq
        int maxFreq =0;
        char ans = s.charAt(0);
        for(int i =0 ; i<26 ; i++){
            if(freq[i]>maxFreq){
                maxFreq = freq[i];
                ans = (char) (i + 'a');
            }
        }

        return ans;
    }
}

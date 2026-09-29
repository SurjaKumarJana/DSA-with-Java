package setAndMap.easy;

/*
problem url: https://www.geeksforgeeks.org/problems/array-subset-of-another-array2317/1
 */



import java.util.HashMap;


/*      solution using HashMap, TC = O(n), SC --> O(n)
    -------------------------------------------        */
public class ArraySubset {
    public boolean isSubset(int a[], int b[]) {
        boolean flag = true;
        HashMap<Integer, Integer> map = new HashMap();
        for( int x : a){
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        for(int x : b){
            if(map.containsKey(x)) {
                map.put(x, map.get(x) - 1);
                if(map.get(x)<1) map.remove(x);
            }
            else flag = false;
        }
        return flag;
    }
}

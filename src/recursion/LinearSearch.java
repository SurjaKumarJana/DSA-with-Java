package recursion;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int element = 0;
        System.out.println(element +" is present in this array :"+isPresent(arr,0,element));
    }

    private static boolean isPresent(int[] arr,int idx, int element) {

        if(idx == arr.length) return false;
        if(arr[idx] == element) return true;

        return isPresent(arr,idx+1,element);
    }
}

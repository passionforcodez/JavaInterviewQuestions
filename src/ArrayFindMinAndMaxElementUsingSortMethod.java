/*
Find Min and Max of the given array using Arrays.sort()
 */
import java.util.Arrays;

public class ArrayFindMinAndMaxElementUsingSortMethod {
    public static void main (String[] args){
        int[] arr = {5,7,1,6,9,10};
        Arrays.sort(arr);
        System.out.println(arr[0]);
        System.out.println(arr[arr.length-1]);
    }
}

//time Complexity: O(nlogn)
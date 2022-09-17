/*
Remove duplicate elements from Array using Stream
Stream: does not sort the given unsorted array whereas hashmap and
hashset sorts the given array by default
 */

import java.util.Arrays;

public class ArraysRemoveDuplicateUsingStreamUnsorted {
    public static void main(String[] args){
        int [] arr = {1,7,5,4,3,6,7,7,4,2};
        Arrays.sort(arr);
        Arrays.stream(arr).distinct().forEach(element -> System.out.print(element +" "));
    }
}

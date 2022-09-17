/*
Remove duplicate elements from Array using Stream
Stream: does not sort the given unsorted array whereas hashmap and
hashset sorts the given array by default
 */

import java.util.Arrays;

public class ArraysRemoveDuplicateUsingStreamSorted {
    public static void main(String[] args){
        int [] arr = {1,1,2,3,3,5,5,5};
        Arrays.stream(arr).distinct().forEach(element -> System.out.print(element +" "));
    }
}

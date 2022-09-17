/* Remove duplicates from a Given Sorted Array Using HashSet
* Array = {1,3,6,5,7,7,5,3,1,6}
* Output: {1,3,5,6,7}
*
* Why HashSet:
* HashSet will not store duplicates
* Hashset is a collection of items where every item is unique.
* It has many methods like -> add(), contains(), remove(), clear()
*  */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArraysRemoveDuplicateUsingHashSetSorted {
    public static void main(String[] args){
        int[] arr = {1,1,2,3,3,5,5,5};
        //Adding each element from the array to hash set one by one.
        //So we need to create an object for hashset.
        Set<Integer> set = new HashSet<Integer>(); //created an object for HashSet
        //Now we have to add unique values to hash set.
        for(int i = 0; i <arr.length; i++){
            set.add(arr[i]);
        }
        //Now we have to convert Hashset into array.
        //set.toArray(); //will convert the set to array but in object form
        //we have to convert it into Integer.
        Integer[] uniquiearr = set.toArray(new Integer[set.size()]);
        System.out.print(Arrays.toString(uniquiearr));
    }
}

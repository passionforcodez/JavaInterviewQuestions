/*
In an array, elements are considered to be "leaders" when their value
is greater than the sum of all the elements to their right side.
Write a method or function that, given an array of natural numbers,
will return all the "leaders" present in the array.
If there are no leaders in the array,
the method/function should return an empty array.

Examples:  {7, 8, 9, 0} returns {9}.  {18, 19, 9, 2, 1} returns {19, 9, 2}
 */

import java.util.ArrayList;

public class ArrayLeadersIfValueIsGreaterThanTheSumOfAllTheElementsToTheirRight {

    public static void main(String[] args) {
        int[] array = new int[]{18, 19, 9, 2, 1};
        ArrayList<Integer> list = new ArrayList<>();
        int max= array[0];
        int index = 0;
        for(int i=0;i<array.length;i++) {
            if(array[i]>max) {
                //max = array[i];
                index = i;
            }
        }

        for(int i = index; i<array.length;i++) {
            if(array[i] != 0 && array[i] != 1)
                list.add(array[i]);
        }

        System.out.println(list);
    }

}


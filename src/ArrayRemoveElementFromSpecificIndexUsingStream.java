/*
Get the array and the index.
Convert the array into IntStream using IntStream. range() method.
Remove the specified index element using the filter() method.
Map and form a new array of the filtered elements using map() and toArray() methods.
Return the formed array.
 */

import java.util.stream.IntStream;

public class ArrayRemoveElementFromSpecificIndexUsingStream {
    public static int[] removeElement( int arr[], int index){
        // If the array is empty
        // or the index is not in array range
        // return the original array
        if (arr == null || index < 0 || index>= arr.length){
            return arr;
        }
        // return the resultant array
        return IntStream.range(0, arr.length)
                .filter(i -> i!=index)
                .map(i->arr[i])
                .toArray();
    }
    public static void main(String[] args){
        int [] arr = {2,9,7,5,4,1,5};
        int index = 3;
        arr = removeElement(arr,index);
        for (int i =0; i< arr.length; i++) {
            System.out.print( arr[i] + " ");
        }
        //System.out.print(Arrays.toString(arr));   //output: [2 9 7 4 1 5]
    }

}

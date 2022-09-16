//Sorting an array in ascending order using an in built function
//Arrays.sort(array)

import java.util.Arrays;

public class ArraySortAnArrayInAscendingOrderUsingInBuiltFunction {
    public static void main(String[] args){
        int[] arr = {3,1,5,2};
        Arrays.sort(arr);                       //sorting arrays in ascending order
        int i=0;
        for(i=0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}

//Time Complexity: O(nlogN)
/*
Remove duplicate elements from the given array using sort
 */

import java.util.Arrays;

public class ArraysRemoveDuplicateUsingTempSorted {
    public static void main (String[] args){
        int[] arr = {1,1,2,3,3,5,5,5};
        //first we will sort the array
        int tempArray[] = new int[arr.length];  //creating a temporary storage to store array without duplicates
        int j = 0;

        for(int i =0; i< arr.length-1; i++) {
            if (arr[i] != arr[i + 1]) {
                tempArray[j++] = arr[i];   //post increment of jth index after putting value in jth position
            }
        }
        //storing the last element directly to the last index of tempArray
        tempArray[j++]= arr[arr.length-1];
        for(int i = 0; i< j; i++){
            System.out.print(tempArray[i]+" ");
        }

    }
}

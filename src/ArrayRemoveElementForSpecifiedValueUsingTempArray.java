/*
Remove element from a given array using temp array
Remove element 3 from given array {3,2,2,5,3,6,3}
Using single array......
 */

public class ArrayRemoveElementForSpecifiedValueUsingTempArray {
    public static void main (String[] args){
        int [] arr = {3,2,2,5,3,6,3};
        int [] tempArray = new int[arr.length];
        int val = 2;
        int j = 0;
        for (int i =0; i< arr.length; i++){
            if(arr[i] != val){
                tempArray[j++] = arr[i];
            }
        }
        for (int i =0; i< j; i++) {
            System.out.print( tempArray[i] + " ");
        }
    }

}

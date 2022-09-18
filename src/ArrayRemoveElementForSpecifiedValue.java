/*
Remove element from a given array without using temp array
Remove element 3 from given array {3,2,2,5,3,6,3}
Using single array......
 */


public class ArrayRemoveElementForSpecifiedValue {
    public static void main (String[] args){
        int [] arr = {3,2,2,5,3,6,3};
        int val = 3;
        int j = 0;
        for (int i =0; i< arr.length; i++){
            if(arr[i] != val){
                arr[j++] = arr[i];
            }
        }
        for (int i =0; i< j; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}

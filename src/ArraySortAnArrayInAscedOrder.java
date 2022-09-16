//Sorting an array in Ascending order by using swap technique....

public class ArraySortAnArrayInAscedOrder {
    public static void main(String[] args){
        int [] arr = {3,7,9,5,6,2,1};
        int temp = 0;
        for(int i =0; i<arr.length; i++){
            for(int j =i; j< arr.length; j++){
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr [j];
                    arr[j] = temp;
                }
            }
        }
        for(int j = 0; j< arr.length; j++){
            System.out.print(arr[j]+" ");
        }
    }
}


//Time Complexity is O(n^2)
public class ArrayFindMinAndMaxElementUsingIndexes {
    public static void main(String[] args){
        int [] arr = {3,8,4,1,10,4,10};
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i< arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}

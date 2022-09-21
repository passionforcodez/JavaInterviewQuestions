// Java code for Kth smallest element
// in an array
import java.util.Arrays;

public class ArrayFindKthSmallestElementInAnArrayUsingSort {
        // Function to return K'th smallest
        // element in a given array
        public static int kthSmallest(Integer[] arr, int K)
        {
            // Sort the given array
            Arrays.sort(arr);

            // Return K'th element in
            // the sorted array
            return arr[K - 1];
        }

        // driver's code
        public static void main(String[] args)
        {
            Integer arr[] = new Integer[] { 12, 3, 5, 7, 19 };
            int K = 3;

            // Function call
            System.out.print("K'th smallest element is "
                    + kthSmallest(arr, K));
        }
}


//Time Complexity: O(nLogn).
//Auxiliary Space: O(1)
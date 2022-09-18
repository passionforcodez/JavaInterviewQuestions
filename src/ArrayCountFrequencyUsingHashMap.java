/*
Counting frequency of elements in an array.
 */

import java.util.HashMap;

public class ArrayCountFrequencyUsingHashMap {
    public static void main (String[] args){
        int [] arr = {3,3,1,3,1,2,6,4,6};
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i =0; i< arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1); //if contains, count +1
            }
            else{
                map.put(arr[i],1);
            }
        }
        System.out.println(map);

    }
}

//time complexity O(n)
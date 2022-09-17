/*Remove duplicates from a given sorted array using Hash Map


* A HashMap stores item in key value pair, and you can access them
* by an index of another type.
* there are various methods we use, like put(), get(), remove(), clear()*/


import java.util.HashMap;

public class ArraysRemoveDuplicateUsingHashMapSorted {
    public static void main(String[] args){
        int[] arr = {1,1,2,3,3,5,5,5};
        //Adding ech element from the array to hashmap one by one
        //So we need to create an object for hashmap
        HashMap<Integer, Integer> map = new HashMap<>(); //creating an object for hashmap
        //Now we have to add unique values to hashmap.
        for(int i = 0; i <arr.length-1; i++){
            if(map.containsKey(arr[i])){
                map.remove(arr[i]);
            }
            map.put(arr[i],i);
        }
        System.out.println(map);
        map.forEach((k,v) -> System.out.println(k + " "));
    }
}

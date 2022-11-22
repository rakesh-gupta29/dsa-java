package Arrays;

import java.util.HashMap;
import java.util.HashSet;

public class UniqueOccurances {
    public static void main(String[] args) {
        // https://leetcode.com/problems/unique-number-of-occurrences/
        int[] arr = {1,2,2,1,1,3};
        System.out.println(isUnique(arr));
    }
    public static boolean isUnique(int[] arr) {
        HashMap <Integer,Integer > freq = new HashMap<>();
        for ( int i =  0 ; i< arr.length ;i++) {
           freq.put(arr[i],freq.getOrDefault(arr[i], 0 ) + 1 ) ;
        }
        HashSet<Integer> set = new HashSet<>();
        for(int i:freq.keySet()){
           if( set.contains(freq.get(i))) {
               return  false;
           }else {
               set.add(freq.get(i));
           }
        }
        return true ;
    }
}

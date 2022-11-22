package Arrays;

import java.util.ArrayList;
import java.util.Set;
import java.util.List;
import java.util.HashSet;

public class FindDiffOfArrays {
    public static void main(String[] args) {
        // https://leetcode.com/problems/find-the-difference-of-two-arrays/
        int [] a = {1,2,3};
        int [] b = {2,4,6};
        System.out.println(unique( a, b ));
    }
     static  List<List<Integer>> unique ( int [] a , int [] b ) {
        List<List<Integer>> result = new ArrayList<>();
         Set<Integer>  setA = new HashSet<>();
         Set<Integer>  setB = new HashSet<>();
         for ( int  elem : a) {
             setA.add( elem);
         }
         for ( int  elem : b) {
             setB.add( elem);
         }
         // both hasve unique elements . Now check for concurrance
         List<Integer> unique1 = new ArrayList<>();
         List<Integer> unique2 = new ArrayList<>();
         for ( int elem : setA) {
             if ( setB.contains(elem)) {
                 setB.remove(elem);
             }else {
                 unique1.add(elem); // unique 1 has all unique elements
             }
         }
         for ( int elem : setB) {
             unique2.add(elem);
         }
         result.add(unique1);
         result.add(unique2);
         return  result;




     }
}

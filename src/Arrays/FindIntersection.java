package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class FindIntersection {
    public static void main(String[] args) {
        // https://leetcode.com/problems/intersection-of-two-arrays/
        int [] a = {1,2,2,1}, b= {2,3,1 };
        System.out.println(Arrays.toString(findCommon ( a,b )) );
    }
     public  static int[] findCommon ( int [] a , int [] b) {
         HashSet<Integer>  set  = new HashSet<>() ;
         for ( int i : a ) {
             set.add(i);
         }
         HashSet<Integer> common = new HashSet<>();
         for ( int j : b) {
             if ( set.contains(j)) {
                 common.add(j) ;
             }
         }
         // common set contains all elements that should be in the answer
        int [] ans = new int[common.size()];
         int i = 0 ;
         for ( int k: common) {
             ans[i++] = k;
         }
         return ans ;


     }
}

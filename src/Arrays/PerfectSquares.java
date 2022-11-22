package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class PerfectSquares {
    public static void main(String[] args) {
        // https://leetcode.com/problems/perfect-squares/
        int n = 13;
        System.out.println(countSquares(n));
    }

    static int countSquares(int n) {
        List<Integer> squares = new ArrayList<>();
        int i = 1;
        while (i * i <= n) {
            squares.add(i * i);
            i += 1;
        }
        int[] arr = new int[squares.size()];
        for (int m = 0; m < squares.size(); m++) {
            arr[m] = squares.get(m);
        }
        System.out.println(Arrays.toString(arr));
        if ( arr.length == 0 ) return 0 ;
        return isSum(n, arr);

    }

    static int isSum(int target, int[] arr) {
        HashMap<Integer,Integer> memo = new HashMap<>();
        return checkRec(target, arr , 0  , memo) ;

    }
     static  int checkRec (int target , int[] arr, int count , HashMap<Integer,Integer> memo) {
         if ( target <= 0 ) {
             memo.put( target, Math.min(memo.getOrDefault(0 , Integer.MAX_VALUE), count )) ;
             return  memo.get(target);
         }
         if ( memo.containsKey(target)) {
             return memo.get(target) ;
         }
         int ans = Integer.MAX_VALUE;
         for ( int elem : arr) {
             ans = Math.min( ans, checkRec(target - elem , arr,  count + 1 , memo)) ;

         }
         memo.put(target , ans ) ;
         System.out.println(" call for target " + target + " " + memo.get(target));



         return memo.get( 0 );
     }
}

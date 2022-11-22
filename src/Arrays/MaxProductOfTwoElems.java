package Arrays;

public class MaxProductOfTwoElems {
    public static void main(String[] args) {
        // https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/
        int [] arr = {1,5,4,5}; // ans : 12
        System.out.println(maxProduct( arr));
    }
     public static int maxProduct ( int [] arr) {
         int max  = Integer.MIN_VALUE , secondMax = Integer.MIN_VALUE;
         for ( int i = 0 ; i< arr.length ;i++) {
             if ( arr[ i ] >= max) {
                 secondMax = max ;
                 max = arr[ i] ;
             }
             else if ( arr [ i ] < max  && arr[ i ] > secondMax) {
                 secondMax = arr[i] ;

             }
         }
         System.out.println(" max , secondMax " + max + " " + secondMax);
         return ( max -1 ) * ( secondMax -1 ) ;
     }
}

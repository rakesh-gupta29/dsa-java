package Arrays;

public class SumIsPowerOfYou {
    public static void main(String[] args) {
        // https://leetcode.com/problems/check-if-number-is-a-sum-of-powers-of-three/
        int target = 13 ;
        int [] arr = {4,9};
        System.out.println(isSum( target , arr ));
    }
     static  boolean isSum ( int target, int [] arr) {
        if ( target  == 0 ) return true ;
        if ( target < 0 ) return false ;
        boolean ans = false ;
        for ( int elem : arr) {
            ans = ans || isSum( target - elem , arr ) ;
        }
         return ans ;
     }

}

package Arrays;
import java.util.HashSet;
public class CountTriplets {
    public static void main(String[] args) {
        // https://leetcode.com/problems/count-square-sum-triples/
        int n  = 10 ;
        System.out.println(countTriplets ( n) );
    }
     static  int countTriplets ( int n) {
         var squares = new HashSet<Integer>();
         int count = 0 ;
        for ( int a = 1 ; a <=n ; a++) {
            squares.add(a * a) ;
        }
        // find the  triplets for this
         for ( int i = 1 ; i < n ;i++) {
             for ( int j = i ;j * j  + i * i  <= n * n  ;j++) {
                 if ( squares.contains(i * i + j * j)) {
                     count += 2 ;
                 }
             }
         }
         return count ;

     }
}

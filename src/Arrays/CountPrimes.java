package Arrays;

public class CountPrimes {
    public static void main(String[] args) {
        // https://leetcode.com/problems/count-primes/
        int n = 10 ;
        System.out.println(countPrimes( n));
    }
     static  int countPrimes ( int n) {
         if ( n < 2) return 0 ;
         boolean [] primes = new boolean[n] ;
         for ( int i = 0  ;i < primes.length ;i++) {
             primes[i] = true ;
         }
         for (int i = 2 ; i * i< primes.length ;i++) {
             if ( primes[ i]) { // avoid duplication
                 for ( int j =   i ; i * j  < primes.length ;j++) { // first number will be prime
                     primes[ i * j ]  = false ;
                 }
             }
         }
         int count = 0 ;
         for ( int k = 2 ; k< primes.length ;k++) {
             if ( primes[k]) count++;

         }
         return count ;
     }
}

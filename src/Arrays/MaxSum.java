package Arrays;

public class MaxSum {
    public static void main(String[] args) {
        int [] arr = {-2,-1};
        int ans = maxSumArray( arr) ;
        System.out.println("Ans is " + ans );
    }

    static   int maxSumArray ( int [] arr) {
        int max =Integer.MIN_VALUE , ptr =0 , len = arr.length, curr = 0 ;
        while( ptr < len ) {
            curr= curr + arr[ptr] ;
            max = Math.max(max , curr);
            if ( curr <  0 ){
                curr = 0 ;
            }
            ptr = ptr +1  ;
        }
        return max ;
    }
}

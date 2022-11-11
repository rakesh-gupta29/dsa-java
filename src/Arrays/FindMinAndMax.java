package Arrays;

public class FindMinAndMax {
    public static void main(String[] args) {
        // https://leetcode.com/problems/removing-minimum-and-maximum-from-array/
        int[] arr = {0, -4, 19, 1, 8, -2, -3, 5};
        //           0   1   2  3  4   5   6  7
        System.out.println(remove(arr));
    }

    public static int remove(int[] arr) {
        if ( arr.length == 1 ) return 1 ;
        int min = 0 , max = 0, l = arr.length ;
        for ( int i = 0 ; i<  l ; i++) {
            if ( arr[ i ] < arr[ min]) {
                min =  i  ;
            }
            if ( arr [ i ] > arr[ max] ) {
                max = i ;
            }

        }
        int maxIdx = Math.max (min ,max ) , minIdx = Math.min( min ,max ) ;
        return Math.min( Math.min( maxIdx + 1 ,  l - minIdx ) , minIdx + 1 + l - maxIdx ) ;
    }


}

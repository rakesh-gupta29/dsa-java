package Arrays;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] num = {9,9,9,9};
        System.out.println(Arrays.toString(increment(  num)));
    }
    public  static  int[] increment ( int[] arr) {
        for ( int i = arr.length -1 ; i>= 0 ; i--) {
            if ( arr[ i] < 9 ) {
                arr[i]++;
                return arr;
            }
             arr[ i] = 0 ;
        }
        arr = new int [ arr.length + 1 ];

        arr[ 0] =1 ;
        return arr;
    }
}

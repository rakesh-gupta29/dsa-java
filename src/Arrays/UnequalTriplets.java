package Arrays;

public class UnequalTriplets {
    public static void main(String[] args) {
        // https://leetcode.com/problems/number-of-unequal-triplets-in-array/
        int [] arr = {4,4,2,3,4};
        System.out.println(unequalArrays ( arr));
    }
     static  int unequalArrays ( int [] arr) {
        int  result =  0, l = arr.length;
        for ( int a  = 0 ;a <   l ;a++) {
            for ( int b = a + 1; b< l ;b++ ) {
                for ( int c =  b + 1 ; c < l ;c++) {
                    if ( arr[ a] != arr[ b] && arr[b] != arr[c] && arr[a] != arr[ c]) result++;
                }
            }
        }
         return  result ;
     }
}

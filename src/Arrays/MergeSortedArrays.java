package Arrays;

import java.util.Arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {
        //  https://leetcode.com/problems/merge-sorted-array/
        int [] arr1 = {1,2,3,0,0,0}, arr2 = {2,5,6};
        System.out.println(Arrays.toString(merge ( arr1,3,  arr2,3 )));
    }
    public  static  int[] merge ( int [] arr1,int m ,  int [] arr2, int n ) {
        int i = m - 1 , j = n - 1;
        // Initialize a variable k to store the last index of the 1st array...
        int k = m + n - 1;
        while( i >= 0 && j >= 0 ) {
            if ( arr1[i] >= arr2 [ j]) {
                arr1[ k ] = arr1[ i ] ;
                i--;
            }else {
                arr1 [ k ] = arr2 [ j] ;
                j--;
            }
            k--;
        }
        // While i does not become zero...
        while(i >= 0)
            arr1[k--] = arr1[i--];
        // While j does not become zero...
        while(j >= 0)
            arr1[k--] = arr2[j--];
        // Now 1st array has all the elements in the required sorted order...
        return arr1;




    }
}

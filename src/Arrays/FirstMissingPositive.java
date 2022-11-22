package Arrays;

import java.util.Arrays;

public class FirstMissingPositive {
    public static void main(String[] args) {
        // https://leetcode.com/problems/find-the-duplicate-number/
        int[] arr = {3,4,-1,1};
        System.out.println( findMissing(arr));
        System.out.println(Arrays.toString(arr));
    }

    public static  int  findMissing(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIdx = arr[i] -1 ;
            if ( arr[i ] > 0 && correctIdx < arr.length && arr[correctIdx] != arr[i]) {
                swap(arr, correctIdx, i);
            } else {
                i++;
            }
        }
        for ( int j = 0 ; j< arr.length ;j++) {
            if (arr[j] -1  != j) {
                return j + 1  ;
            }
        }
        return arr.length  + 1  ;
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}

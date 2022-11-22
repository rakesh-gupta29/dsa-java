package Arrays;

import java.util.Arrays;

public class FindMissing {
    public static void main(String[] args) {
        // https://leetcode.com/problems/find-the-duplicate-number/
        int[] arr = {3, 0, 1};
        System.out.println( findMissing(arr));
        System.out.println(Arrays.toString(arr));
    }

    public static  int  findMissing(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIdx = arr[i];
            if (correctIdx < arr.length && arr[correctIdx] != arr[i]) {
                swap(arr, correctIdx, i);
            } else {
                i++;
            }
        }
         for ( int j = 0 ; j< arr.length ;j++) {
             if (arr[j] != j) {
                 return j ;
             }
         }
         return arr.length ;
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}

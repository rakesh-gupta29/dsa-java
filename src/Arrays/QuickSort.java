package Arrays;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        // https://leetcode.com/problems/sort-an-array/

        int[] arr = {3,4,5,2,1};
        quickSort(arr, 0, arr.length - 1, 2 );
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int start, int end, int k) {

        if (start >= end) return; // input is empty or single element array
        // since we have t use start and end , let's create copies
        int low = start, high = end;
        int pivot = arr[(start + (end - start) / 2)];

        while (low <= high) {
            while (arr[low] < pivot) {
                low++;
            }
            while (arr[high] > pivot) {
                high--;
            }
            if ( low <= high) {
                swap( arr, low , high) ;
                low++;
                high--;
            }
        }
        // pivot is at right position
        System.out.println(high + 1 );

        quickSort(arr, start, high , 0  );

        quickSort( arr, low , end  , 0 );
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

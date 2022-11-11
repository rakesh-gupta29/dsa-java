package Arrays;

import java.util.Arrays;

public class QuickSortWithFirstAsPivot {
    public static void main(String[] args) {
        // https://leetcode.com/problems/sort-an-array/

        int[] arr = {5, 4, 3, 2, 1};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int start, int end) {
        if (start >= end) return; // input is empty or single element array
        // since we have t use start and end , let's create copies
        int low = start, high = end;
        int pivot = arr[low];

        while (low <= high) {
            while (arr[low] < pivot) {
                low++;
            }
            while (arr[high] > pivot) {
                high--;
            }
            if (low <= high) {
                swap(arr, low, high);
                low++;
                high--;
            }

        }
        System.out.print( " start and end " + start + " " + end + "  " );
        System.out.print(Arrays.toString(arr));
        System.out.println();

        quickSort( arr, start, high);
        quickSort(arr, low, end );
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


}

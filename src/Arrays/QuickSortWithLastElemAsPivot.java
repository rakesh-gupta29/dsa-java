package Arrays;

import java.util.Arrays;

public class QuickSortWithLastElemAsPivot {
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
        int pivot = arr[end];

        while (low < high) {
            while (arr[low] <= pivot) {
                low++;
            }
            while (arr[high] >= pivot) {
                high--;
            }

            swap(arr, low, high);


        }
        if (arr[low] > arr[high]) {
            swap(arr, low, pivot);
        } else {
            low = high;
        }

        // pivot is at right position
        quickSort(arr, start, low - 1);

        quickSort(arr, low + 1, end);
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

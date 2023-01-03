package Arrays;

import java.util.Arrays;

public class KthLargest {
    public static void main(String[] args) {
        int[] arr = {5, 4, 1, 2, 3};
        sort(arr, 0, arr.length - 1, 2);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr, int low, int high, int k) {
        if (low == high) return;
        int start = low, end = high, mid = start + (end - start) / 2, pivot = arr[mid];
        while (start <= end) {
            while (arr[start] < pivot) start++;
            while (arr[end] > pivot) end--;
            if (start <= end) {
                swap(arr, start, end); start++ ; end--;
            }
        }
        sort(arr, start, high, k);
        sort(arr, low, end, k);
    }

    private static void swap(int[] nums, int x, int y) {
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
}
package BinarySearch;

import java.util.Arrays;

class StartAndEnd {
    public static void main(String[] args) {
        //  https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
        int[] arr = {5, 7, 7, 8, 8, 10}; // [3,4]
        int target = 6;
        int[] ans = findFirstAndLast(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] findFirstAndLast(int[] arr, int target) {
        int[] ans = {-1, -1};
        ans[0] = getIndex(arr, target, true);
        if (ans[0] != -1) {
            ans[1] = getIndex(arr, target, false);
        }
        return ans;
    }

    static int getIndex(int[] arr, int target, boolean isFirst) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < target) {
                // target is on right side
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                // target= arr[mid]  this  is one of potential answers
                ans = mid;
                if (isFirst) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }


        return ans;

    }

}
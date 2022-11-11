package Arrays;

import java.util.Arrays;

public class MoveOddToEnd {
    public static void main(String[] args) {
        // https://leetcode.com/problems/sort-array-by-parity/
        int[] arr = {1,2,3,4,5,6,7};
        seg(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void seg(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            if (nums[left] % 2 == 1) {
                if (nums[right] % 2 == 0) {
                    int temp = nums[left];
                    nums[left] = nums[right];
                    nums[right--] = temp;
                } else {
                    --right;
                }
            } else {
                ++left;
            }
        }


    }



}

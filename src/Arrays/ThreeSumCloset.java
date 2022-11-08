package Arrays;

import java.util.Arrays;

public class ThreeSumCloset {
    public static void main(String[] args) {
        // https://leetcode.com/problems/3sum-closest/submissions/
        int[] arr = {-1, 2, 1, -4};
        int target = 1;
        int ans = threeSum(arr, target);
        System.out.println(ans);
    }

    public static int threeSum(int[] arr, int target) {
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE; // hold  the latest min diff
        int result = 0; // ans
        for (int i = 0; i < arr.length; i++) {
            int low = i + 1;
            int high = arr.length - 1;
            while (low < high) {
                int itr = arr[i] + arr[low] + arr[high];
                int diff = Math.abs( itr - target); // diff in current iteration
                if (diff < min) {
                    min = diff;
                    result = itr ;
                }
                if ( itr <=  target ) {
                    // this is to be increased
                    low++;
                }else {

                    high--;
                }
            }
        }
        return  result;

    }
}

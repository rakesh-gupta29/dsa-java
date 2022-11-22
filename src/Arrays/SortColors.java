package Arrays;

import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        // https://leetcode.com/problems/sort-colors/
        int[] arr = {1,0,0,0,1,1,1,1,1,2,2};
        System.out.println(Arrays.toString(sort(arr)));
    }

    public static int[] sort(int[] arr) {
        int zeros = 0, ones = 0, twos = 0;
        for (int digit : arr) {
            if (digit == 0) {
                zeros++;
            } else if (digit == 1) {
                ones++;
            } else {
                twos++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (zeros > 0) {
                arr[i] = 0;
                zeros--;
            } else if (ones > 0) {
                arr[i] = 1;
                ones--;
            } else arr[i] = 2;
        }
        return arr;
    }

}

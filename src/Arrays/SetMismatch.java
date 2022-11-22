package Arrays;

import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        // https://leetcode.com/problems/find-the-duplicate-number/
        int[] arr = {1, 3, 3};
        System.out.println(Arrays.toString(findMissing(arr)));
        System.out.println(Arrays.toString(arr));
    }

    public static int[] findMissing(int[] arr) {
        int i = 0;

        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[correct] != arr[i]) {
                // we need to swap
                swap(arr, i, correct);

            } else {
                i++;
            }

        }
        for (int k = 0; k < arr.length; k++) {
            if (arr[k] - 1 != k) {
                return new int[]{arr[k], k + 1};
            }
        }
        return new int[]{};

    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}

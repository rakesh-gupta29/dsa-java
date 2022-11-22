package Arrays;

public class StrictlyIncreasing {
    public static void main(String[] args) {
        // https://leetcode.com/problems/remove-one-element-to-make-the-array-strictly-increasing/
        int[] arr = {1, 2, 10, 5, 7};
        System.out.println(strictlyIncreasing(arr));
    }

    public static boolean strictlyIncreasing(int[] arr) {
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= arr[i - 1]) {
                count++;
                if (count == 2) {
                    return false;
                }
                // allow one mistake
                if (i > 1 && arr[i] <= arr[i - 2]) {
                    arr[i] = arr[i - 1];
                }
            }
        }
        return true;

    }
}

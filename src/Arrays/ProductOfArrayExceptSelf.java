package Arrays;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] target = {1, 2, 3};
        System.out.println(Arrays.toString(productExceptSelf(target)));
    }

    public static int[] productExceptSelf(int[] arr) {
        int[] leftProducts = new int[arr.length];
        int[] rightProducts = new int[arr.length];
        // finding all products to the left of the array and to the right of elements. Their product will represent the elem
        leftProducts[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            leftProducts[i] = leftProducts[i - 1] * arr[i - 1];
        }
        rightProducts[arr.length - 1] = 1;
        for (int j = arr.length - 2; j >= 0; j--) {
            rightProducts[j] = arr[j + 1] * rightProducts[j + 1];
        }
        int[] ans = new int[arr.length];
        int counter = 0;
        while (counter < arr.length) {
            ans[counter] = leftProducts[counter] * rightProducts[counter];
            counter++;
        }
        return ans;
    }


}

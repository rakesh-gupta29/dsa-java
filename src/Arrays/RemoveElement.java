package Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        // https://leetcode.com/problems/remove-element/

        int[] arr = {0, 1, 2, 2, 3, 0, 4, 2};
        int k = 2;
        // output : 2 ;
        System.out.println(removeElem(arr, k));
    }

    public static int removeElem(int[] arr, int k) {
        int pointer = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                continue;
            }
            arr[pointer] = arr[i];
            pointer++;
        }
        return pointer;

    }
}

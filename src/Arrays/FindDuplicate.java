package Arrays;

public class FindDuplicate {
    public static void main(String[] args) {
        // https://leetcode.com/problems/find-the-duplicate-number/
        int[] arr = {3,1,3,4,2};

        System.out.println(cyclicSort(arr));
    }

    public static int cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIdx = arr[ i ] -1 ;
            if (correctIdx != i) {
                // correct index is not equal to current index
                if (arr[correctIdx] != arr[i]) {
                    swap(arr, correctIdx, i);
                } else {
                    return arr[i];
                }
            } else {
                i++;
            }
        }
        return -1;

    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

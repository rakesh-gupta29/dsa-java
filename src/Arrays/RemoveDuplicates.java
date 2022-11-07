package Arrays;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> ans = getAns(arr);
        System.out.println(ans);
    }

    public static List<Integer> getAns(int[] arr) {
        List<Integer> ans = new ArrayList<>();
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            int idx = Math.abs(arr[i]) - 1; // taking the index as if they are positive to mark the index
            if (arr[idx] > 0) {
                arr[idx] = -arr[idx];
            }
        }
        for (int i = 0; i < len; i++) {
            if (arr[i] > 0) {
                ans.add(i + 1);
            }
        }
        return ans;
    }
}

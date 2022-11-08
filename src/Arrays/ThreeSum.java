package Arrays;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;

public class ThreeSum {
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        List<List<Integer>> ans = threeSum(arr);
        System.out.println(ans);
    }

    public static List<List<Integer>> threeSum(int[] arr) {
        Arrays.sort(arr);
        int l = arr.length;
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < l - 2; i++) {
            if (i == 0 || arr[i - 1] != arr[i]) {
                int sum = 0 - arr[i];
                int start = i + 1;
                int end = l - 1;
                while (start < end) {
                    if (arr[start] + arr[end] == sum) {
                        ans.add(Arrays.asList(arr[i], arr[start], arr[end]));
                        while (start < end && arr[start] == arr[start + 1]) start++;
                        while (start < end && arr[end] == arr[end - 1]) end--;
                        start++;
                        end--;
                    } else if (arr[start] + arr[end] < sum) start++;
                    else end--;
                }
            }
        }
        return ans;
    }
}

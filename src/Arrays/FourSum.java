package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class FourSum {
    public static void main(String[] args) {
        int[] arr = {};
        ArrayList<ArrayList<Integer>> ans = threeSum(arr);
        System.out.println(ans);
    }

    public static ArrayList<ArrayList<Integer>> threeSum(int[] arr) {
        Arrays.sort(arr);
        int l = arr.length;
        HashSet<ArrayList<Integer>> set = new HashSet<>();
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for (int i = 0; i < l; i++) {
            for (int j = i + 1; j < l; j++) {

                int k = j + 1;
                int m = l - 1;
                while (k < m) {
                    int sum = arr[i] + arr[j] + arr[k] + arr[m];
                    if (sum > 0) {
                        m--;
                    } else if (sum < 0) {
                        k++;
                    } else {
                        ArrayList<Integer> temp = new ArrayList<>();
                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        temp.add(arr[k]);
                        temp.add(arr[m]);
                        if (!set.contains(temp)) {
                            set.add(temp);
                            result.add(temp);
                        }
                        m--;
                        k++;
                    }
                }
            }
        }
        return result;
    }
}

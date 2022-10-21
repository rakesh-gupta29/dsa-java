package Arrays;

import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {
        // https://leetcode.com/problems/contains-duplicate/
        int[] arr = {1,2,3,4,5,6};
        int k = 2;
        boolean ans = getAns(arr, k);
        System.out.println(ans);

    }

    public static boolean getAns(int[] nums, int k) {
        HashSet<Integer> set = new HashSet();
        int temp = 0;
        int len = nums.length;
        while (temp < len) {
            if (set.contains(nums[temp])) {
                return true;
            } else {
                set.add(nums[temp]);
            }

            temp += 1;
        }
        return false;
    }

}

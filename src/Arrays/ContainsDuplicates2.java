package Arrays;

import java.util.HashMap;

public class ContainsDuplicates2 {
    public static void main(String[] args) {
        // https://leetcode.com/problems/contains-duplicate-ii/
        int[] arr = {1, 2, 3, 1, 2, 3};
        int k = 2;
        boolean ans = getAns(arr, k);
        System.out.println(ans);
    }

    public static boolean getAns(int[] nums, int k) {
        HashMap<Integer, Integer> memo = new HashMap();
        int temp = 0;
        int len = nums.length;
        while (temp < len) {
            if (memo.containsKey(nums[temp])) {
                if (temp - memo.get(nums[temp]) > k) {
                    memo.put(nums[temp], temp);
                } else {
                    System.out.println(temp + "," + nums[temp]);
                    return true;
                }
            } else {
                memo.put(nums[temp], temp);
            }
            temp += 1;
        }
        return false;
    }
}

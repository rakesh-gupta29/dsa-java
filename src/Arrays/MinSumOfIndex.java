package Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MinSumOfIndex {
    public static void main(String[] args) {
        // https://leetcode.com/problems/minimum-index-sum-of-two-lists/
        String[] list1 = {"Shogun","Tapioca Express","Burger King","KFC"}, list2 = {"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"};
        ans(list1, list2);
    }

    static String [] ans(String[] a, String[] b) {
        HashMap<String, Integer> memo = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            memo.put(a[i], i);
        }
        int min = Integer.MAX_VALUE;
        List<String> ans = new ArrayList<>();
        for (int j = 0; j < b.length; j++) {
            if (memo.containsKey(b[j])) {
                int sum = j + memo.get(b[j]);
                System.out.println(sum);
                if (sum < min) {
                    ans.clear();
                    ans.add(b[j]);
                    min = sum;
                } else if (sum == min) {
                    ans.add(b[j]);

                }
            }
        }
        String[] result = new String[ans.size()];
        for (int k = 0; k < ans.size(); k++) {
            result[k] = ans.get(k);
        }
        return result;
    }
}

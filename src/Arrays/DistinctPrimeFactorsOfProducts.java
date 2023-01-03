package Arrays;

import java.util.HashSet;
import java.util.Set;


public class DistinctPrimeFactorsOfProducts {
    public static void main(String[] args) {
        // https://leetcode.com/problems/distinct-prime-factors-of-product-of-array/

        int[] arr = {2, 4, 3, 7, 10, 6};
        int ans = getFactors(arr);
        System.out.println(ans);
    }

    public static int getFactors(int[] arr) {
        Set<Integer> memo = new HashSet<>();
        for (int a : arr) {
            for (int i = 2; i <= a; i++) {
                // if this is prime  and not in the set, increase  the set
                if (a % i == 0 && isPrime(i)) {
                    memo.add(i);
                }
            }
        }
        return memo.size();
    }

    public static boolean isPrime(int target) {
        for (int i = 2; i * i <= target; i++) {
            if (target % i == 0) return false;
        }
        return true;
    }
}

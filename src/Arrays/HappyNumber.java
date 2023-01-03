package Arrays;

import java.util.HashSet;

public class HappyNumber {
    public static void main(String[] args) {
        // https://leetcode.com/problems/add-digits/
        int target = 2;
        System.out.println(isHappy(target));
    }

    public static boolean isHappy(int target) {
        HashSet<Integer> memo = new HashSet<>();
        int result = iteration(target);
        while (result != 1 && !memo.contains(result)) {
            memo.add(result);
            result = iteration(result);
        }
        return result == 1;
    }

    public static int iteration(int target) {
        int sum = 0;
        while (target > 0) {
            sum = sum + (target % 10) * (target % 10);
            target /= 10;
        }
        return sum;
    }

}

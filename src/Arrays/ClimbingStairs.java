package Arrays;

import java.util.HashMap;

public class ClimbingStairs {
    public static void main(String[] args) {
        int steps = 3;
        HashMap<Integer, Integer> memo = new HashMap<>();
        System.out.println(waysIndex(steps));
    }

    public static int ways(int index, HashMap<Integer, Integer> memo) {
        if (index < 0) {
            return 0;
        }
        if (index == 0) {
            return 1;
        }
        if (memo.containsKey(index)) {
            return memo.get(index);
        }
        memo.put(index, ways(index - 1, memo) + ways(index - 2, memo));
        return memo.get(index);


    }

    public static int waysIndex(int index) {
        if (index < 3) return index;
        int one = 1, two = 2;
        for (int i = 3; i <= index; i++) {
            int temp = one;
            one = two;
            two += temp;

        }
        return two ;


    }

}

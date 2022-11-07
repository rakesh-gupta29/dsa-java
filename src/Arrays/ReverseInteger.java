package Arrays;

public class ReverseInteger {
    public static void main(String[] args) {
        //https://leetcode.com/problems/reverse-integer/
        int target = 1534236469;
        int ans = getAns(target);
        System.out.println(ans);
    }

    public static int getAns(int target) {

        long rev = 0;
        boolean isPositive = true;
        if (target < 0) {
            isPositive = false;
            target *= -1;
        }
        while (target > 0) {
            rev = 10 * rev + target % 10;
            target /= 10;
        }
        if (rev >= Integer.MIN_VALUE && rev <= Integer.MAX_VALUE) {
            return (int) rev * (isPositive ? 1 : -1);
        } else {
            return 0;
        }
    }


}

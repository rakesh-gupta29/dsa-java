package Arrays;

public class UglyNumber {
    public static void main(String[] args) {
        int target = 10;
        System.out.println(isUglyNumber(target));
    }

    public static boolean isUglyNumber(int target) {
        if (target < 1) return false;
        if (target == 1) return true;
        if (target % 2 == 0) return isUglyNumber(target / 2);
        if (target % 3 == 0) return isUglyNumber(target / 3);
        if (target % 5 == 0) return isUglyNumber(target / 5);
        return false;
    }
}

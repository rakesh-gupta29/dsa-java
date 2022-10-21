package Arrays;

public class MaxCapacity {
    public static void main(String[] args) {
        int[] bars = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int ans = getAns(bars);
        System.out.println(ans);
    }

    static int getAns(int[] bars) {
        int left = 0, right = bars.length - 1, max = 0;
        while (left < right) {
            if (bars[left] < bars[right]) {
                max = Math.max(max, (right - left) * bars[left]);
                left++;
            } else {
                max = Math.max(max, (right - left) * bars[right]);
                right--;
            }
        }
        return max;
    }
}

package Arrays;

public class GetMaxNum {
    public static void main(String[] args) {
        // https://leetcode.com/problems/maximum-69-number/
        int target = 9669;
        System.out.println(maximise(target));
    }

    public static int maximise(int target) {
        char[] digits = String.valueOf(target).toCharArray(); // to char array
        for (int i = 0 ; i < digits.length ;i++ ) {
            if ( digits[i] == '6') {
                digits[i]= '9';
                break;
            }
        }
        return Integer.parseInt(new String(digits)); // create an array and parse the int value of string.
    }
}

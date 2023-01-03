package Arrays;

public class AddDigits {
    public static void main(String[] args) {
        // https://leetcode.com/problems/add-digits/
        int target =  0 ;
        System.out.println(addDigits(target));
    }

    public static int addDigits(int target) {
        int sum = 0;
        while (target > 0) {
            sum = sum + target % 10;
            target /= 10;
        }
        if ( sum < 10 ) return  sum ;
        else return addDigits( sum );
    }
}

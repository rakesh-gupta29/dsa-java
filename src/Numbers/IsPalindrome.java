package Numbers;

public class IsPalindrome {
    public static void main(String[] args) {
        // https://leetcode.com/problems/palindrome-number/
        int target = 1001;
        System.out.println(isPalindrome(target));
    }

    public static boolean isPalindrome(int target) {
        if ( target < 0 ) return false ;
        int rev = 0 ;
        int og = target ;
        while ( target > 0 ) {
            rev = rev * 10 + target % 10 ; // getting the number reversed
            target /=  10;
        }
        return  og == rev;


    }
}

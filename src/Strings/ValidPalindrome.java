package Strings;

public class ValidPalindrome {
    public static void main(String[] args) {
        // https://leetcode.com/problems/valid-palindrome/
        String s = "race a car";
        System.out.println( isValid (s ));
    }
     static  boolean isValid ( String  s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        for ( int i = 0 ; i< s.length() /2 ;i++) {
            if ( s.charAt(i) != s.charAt(s.length() -i -1 )) {
                return false ;
            }
        }
         return true  ;

     }
}

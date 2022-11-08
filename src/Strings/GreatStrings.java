package Strings;

public class GreatStrings {
    public static void main(String[] args) {
        // https://leetcode.com/problems/make-the-string-great/
        String target = "leEeetcode";
        System.out.println(beautify(target));
    }
     public static  String beautify( String target) {
        for ( int i = 0 ; i< target.length() -1 ;i++){
            // check that the difference is 32 or not.
            if ( Math.abs(target.charAt(i) - target.charAt(i + 1))== 32 ){
                return beautify(target.substring(0,i) + target.substring(i+ 2)); // create a substring by removing both letters
            }
        }
        return target;
     }
}

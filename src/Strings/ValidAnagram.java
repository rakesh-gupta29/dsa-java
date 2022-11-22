package Strings;

import java.util.Arrays;
import java.util.HashMap;

public class ValidAnagram {
    public static void main(String[] args) {
        // both are valid anagrams if they are rearranged form of each other.
        String str1 = "ram";
        String str2 = "mar";
        System.out.println(isAnagram ( str1, str2));
    }
    public  static boolean isAnagram ( String one, String two ) {
        if (one.length() != two.length()) {
            return false ;
        }
        int[] arr = new int[26];
        for ( char c : one.toCharArray()) {
            arr[c-97]++;
        }
        for (  char c : two.toCharArray()) {
            arr[c-97]--;
        }

         for ( int elem : arr) {
             if ( elem != 0 ) {
                 return false ;
             }
         }
         return true;

    }
}

package Strings;

import java.util.Objects;

public class FindNeedleInHaystack {
    public static void main(String[] args) {
        // https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
        String haystack = "aaa", needle = "aa";
        System.out.println( firstFind ( needle , haystack));

    }
     public static int firstFind ( String needle , String haystack) {
         char start_needle = needle.charAt( 0 ) ;
         int index =  0 ;
         int ans =    Integer.MAX_VALUE  ;
         for (  int i = 0 ; i< haystack.length();i++) {
             if (haystack.charAt(i)== start_needle) {
                 index =  i ;
                 String needle_in_stack =  haystack.substring( index, Math.min( index +  needle.length(), haystack.length()));
                 if ( Objects.equals(needle, needle_in_stack)) {
                     ans = Math.min( ans , index );
                 }
             }

         }
          return ans == Integer.MAX_VALUE ? -1 : ans ;
     }
}

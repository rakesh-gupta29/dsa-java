package Strings;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        // https://leetcode.com/problems/reverse-string/
        char[ ] arr = { 'h','e','l','l','o'} ;
        System.out.println(Arrays.toString(rev ( arr)));
    }
    public static  char[] rev (  char []  arr) {
        int end = arr.length % 2  == 0 ?  ( arr.length -1 ) /2 : arr.length /2 ;
         for ( int i = 0 ; i <= end  ; i++) {
             char  temp = arr [ arr.length -1  - i  ] ;
             arr[ arr.length -  1 - i ] = arr[ i] ;
             arr[ i] =  temp ;

         }

          return arr ;
    }
}

package Strings;

import java.util.Arrays;

public class ReverseWordsInSrtring {
    public static void main(String[] args) {
        // https://leetcode.com/problems/reverse-words-in-a-string-iii/
        String str = "";
       System.out.println(  reverse(str) );
    }

    public static String reverse(String str) {
        String[] arr = str.split(" ");
        StringBuilder  ans = new StringBuilder() ;
        for (int i = 0; i < arr.length; i++) {
             ans.append( reverseElem(arr[i])  + " ");
        }
        return ans.toString().trim();
    }

    public static String reverseElem(String elem) {
       StringBuilder str = new StringBuilder() ;
       for ( int i = 0 ; i<elem.length() ;i++) {
           str.append(  elem.charAt( elem.length() -1 - i)) ;

       }
        return  str.toString() ;
    }
}

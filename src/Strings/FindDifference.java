package Strings;

import java.util.Arrays;

public class FindDifference {
    public static void main(String[] args) {
        String a = "ram";
        String b = "rama";
        System.out.println( findDiff( a,b ));
    }
     public  static char findDiff ( String a, String b) {
        int[] arr = new int[26];
       for ( char c : a.toCharArray()) {
           arr[c -97]++;
       }
         System.out.println(Arrays.toString(arr));
         for ( char c : b.toCharArray()) {
             arr[c -97]--;
         }
         System.out.println(Arrays.toString(arr));
         for ( int j = 0 ;j< arr.length ;j++) {
             if ( arr[j] ==  -1) {
                 return  (char)  (j+ 97);
             }
         }
         return ' ';
     }
}

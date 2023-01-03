package Strings;

import java.util.Objects;

public class NumberOfSegments {
    public static void main(String[] args) {
        //https://leetcode.com/problems/number-of-segments-in-a-string/submissions/
         String str =  ", , , ,        a, eaefa";
         String str2 = "Hello, my name is John" ;
         System.out.println( countSegments ( str ));

    }
     public  static  int countSegments ( String s ){
       // check for  non-empty  elements after splitting against space characters
         String [] arr = s.split(" ") ;
         int  count = 0 ;
         for ( String elem : arr) {
              if (!Objects.equals( elem ,"")) { // skip elem is empty
                      count++;
              }
         }
          return count;
     }
}

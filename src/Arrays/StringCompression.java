package Arrays;

import java.util.Arrays;

public class StringCompression {
    public static void main(String[] args) {
        char[] arr = {'a','a','b','b','c','c','c'};
        System.out.println(compress (arr));
    }
    static  int  compress ( char [] chars ) {
        int index = 0 ;
        int i =0 ;
        while ( i < chars.length) {
            int j  = i ;
            while (  j < chars.length &&  chars[ i] == chars[ j]  ) {
                j++ ;
            }
            chars[index++] = chars[ i ] ;
            if ( j -i > 1 ) {
                String times = j - i + "";
                for ( char c : times.toCharArray()) {
                    chars[index++] =  c;
                }
            }
            i = j ;

        }
        return index  ;

    }
}

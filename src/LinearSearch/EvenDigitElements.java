package Searching;

public class EvenDigitElements {
    public static void main(String[] args) {
        // count the number of elements having even number of digits
        int [] arr = {555,901,482,1771};
        System.out.println( getAns ( arr) );
    }
    static int getAns ( int [] arr) {
        int count = 0;
        for ( int elem : arr) {
            if( isEven ( elem)) {
                count++;
            }
        }
        return count ;

    }
    static  boolean isEven ( int elem){
        int digits =  0;
        while ( elem > 0) {
            digits++;
            elem = elem / 10;
        }
        return  digits % 2 == 0;
    }
}

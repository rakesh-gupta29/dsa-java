package Numbers;

public class PowerOfFour {
    public static void main(String[] args) {
        int n = 32 ;
        System.out.print(power ( n ));
    }
    static   boolean power ( int n ) {
        long  i = 1 ;
        while ( i < n ) {
            i *= 4 ;
        }
        // i  will be   either equal to 2 or larger than 2
        return i == n ;
    }
}

package Searching;

public class LinearString {
    public static void main(String[] args) {
        String str = "checkString";
        char target ='i';
        int idx = search( str , target);
        System.out.println(idx);
         boolean doesExist = doesExist( str , target);
        System.out.println(doesExist);

    }
    static int search ( String str , char target) {
        if ( str.length() == 0 ) {
            return -1;
        }
        int len = str.length();
        for ( int i =0 ;i< len ;i++) {
            if ( str.charAt(i) == target) {
                return i ;
            }
        }
        return -1;
    }

    static boolean doesExist (  String str , char target) {
        if ( str.length () == 0 ) {
            return   false ;
        }
        for ( char  item : str.toCharArray() ) {
            if (  item == target) {
                return  true ;
            }
        }
        return false ;
    }
}

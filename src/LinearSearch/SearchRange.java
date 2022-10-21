package Searching;

public class SearchRange {

    // search for target in a given range
    public static void main(String[] args) {
        int [] arr = {15,454,1,-10,74,100,785,12,54};
        int target = 100;
        int start = 0 ;
        int end =  5;
        int idx = searchInrange ( arr, target, start , end );
    }
    static  int searchInrange ( int [] arr , int target, int start, int end ) {
        if ( arr.length == 0 ) {
            return -1;
        }
        int len = arr.length;
        if ( start > len || end < 0  || end < start) {
            return -1 ;
        }
        for ( int i = start; i<  end ;i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}

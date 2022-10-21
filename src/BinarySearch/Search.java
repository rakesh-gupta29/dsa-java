package BinarySearch;

public class Search {
    public static void main(String[] args) {
        int [] arr= {2,3,4,5,6,7,8,9,10};
        int idx = binarySearch ( arr , 5 );
        System.out.println(idx);
    }
    static  int binarySearch ( int [] arr , int  target){
        int  start = 0 ;
        int end = arr.length -1 ;
        while ( start <= end ) {
            int mid = start + ( end - start ) /2 ;
            if ( arr[mid] > target) {
                end = mid -1 ;
            }else if ( arr[mid] < target) {
                start = mid + 1;
            }else {
                return mid ;
            }
        }
        return -1 ;
    }
}

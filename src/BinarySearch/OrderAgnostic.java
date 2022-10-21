package BinarySearch;

public class OrderAgnostic {
    public static void main(String[] args) {
        // applying  binary search where order of sorting ( ascending or descending order) is not known.
        int[] arr = {10,20,30,40,50,60,70,80,90,100};
        int target = 20;
        int ans = search(arr, target);
        System.out.println(ans);
    }
    static  int search ( int [] arr , int target) {
        int start =0 ;
        int end = arr.length -1 ;
        boolean ascending = arr[ start] < arr[ end] ;
        while ( start <= end ) {
            int mid = start + (  end - start) /2 ;
            if ( arr[mid] == target) {
                return mid ;
            }
            if( ascending) {
                if ( arr[ mid] < target) {
                    start = mid + 1;
                }else  {
                    end = mid -1;
                }
            }else {
                if ( arr[ mid] < target) {
                    end = mid -1;

                }else  {
                    start = mid + 1;
                }
            }

        }
        return  -1 ;
    }
}

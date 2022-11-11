package Arrays;

public class KthLargest {
    public static void main(String[] args) {
        // https://leetcode.com/problems/kth-largest-element-in-an-array/
        int [] arr = {3,2,1,5,4,6};
        int k = 2  ;
        System.out.println(quickSelect(arr, k ) );
    }
    public  static  int quickSelect ( int [] arr, int k ) {
       int low = 0 ,  high = arr.length -1 ;
       int pivot = arr [ low + ( high - low ) /2 ] ;
       // put the pivot at right position
        while ( low <= high) {
            while (arr[ low] < pivot  ) {

                low++;
            }
            while ( arr[ high ] > pivot ) {
                high-- ;
            }

            if ( low <= high) {
                swap ( arr , low , high) ;
                low++;
                high--;
            }

        }

        System.out.println("correct index of pivot is " + high );
        return 0 ;
    }
    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}

package Arrays;

public class SingleDuplicate {
    public static void main(String[] args) {
        // https://leetcode.com/problems/single-element-in-a-sorted-array/
        int[] arr = {3,3,7,7,10,11,11};
        System.out.println(findDup(arr));
    }

    public static int findDup(int[] arr) {
            int start = 0, end = arr.length -1 ;
            while(  start <= end ) {
                int  mid = start + ( end - start ) /2 ;
                if(arr[mid]==arr[mid+1]) mid = mid-1;

                if( (mid - start + 1)  % 2 == 0) {
                    start = mid  + 1 ;
                }else {
                     end = mid ;
                }
            }

            return  arr[ start];
    }
}

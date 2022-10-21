package BinarySearch;

public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80,90,100};
        int target =200;
        int ans =  getCeiling (arr, target);
        System.out.println(ans);
    }
    static int getCeiling ( int [] arr , int target) {
        int start= 0;
        int end = arr.length -1 ;
        while( start <= end ) {
            int mid = start + ( end - start ) /2;
            if ( arr[mid] == target) {
                return arr[ mid];
            }else if ( arr[mid] < target)  {
                start = mid +1 ;
            }else{
                end = mid -1 ;
            }
        }
        return  start ;
    }
}


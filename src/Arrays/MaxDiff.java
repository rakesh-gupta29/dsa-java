package Arrays;

public class MaxDiff {
    public static void main(String[] args) {
        //
        int [] arr = {9,4,3,2};
        System.out.println(findDiff(arr));
    }
     public static int findDiff ( int [] arr) {
        int len = arr.length, min = arr[ 0], maxDiff =  0  ;
        for ( int i = 0 ; i<  len ; i++) {
            if ( arr[ i ] < min) {
                min = arr[ i];
            }
            if ( maxDiff < arr[ i ] - min) {
                maxDiff = arr[ i ] - min ;
            }
            System.out.println("min, maxDiff " + min +  " " + maxDiff);
        }
        return maxDiff == 0 ? -1 : maxDiff;
     }
}

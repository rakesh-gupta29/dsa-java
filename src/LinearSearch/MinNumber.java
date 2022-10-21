package Searching;

public class MinNumber {
    public static void main(String[] args) {
        int [] arr= {10,6541,6541654,65,564,65,156,11,6548,9465,16,57489,64165,48,6541,54,6,3541};
        int min = getMin(arr);
        System.out.println(min);
    }
    static  int getMin( int [] arr) {
        if (arr.length == 0 ) {
            return Integer.MAX_VALUE;
        }
        int len = arr.length;
        int ans = arr[0];
        for ( int i =1  ;i< len ;i++) {
            if ( arr[i] < ans ) {
                ans = arr[i];
            }
        }
        return ans;
    }

}

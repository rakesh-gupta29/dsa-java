package Arrays;
import java.lang.reflect.Array;
import java.util.Arrays;
import  java.util.List;
import  java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
         int [] arr = { 4,3,2,7,8,2,3,1} ;
         findDisappearedNumbers(arr);
    }
    public static List<Integer> findDisappearedNumbers(int[] arr) {
        int len = arr.length;
        List<Integer> ans = new ArrayList<>();
        for ( int i =0 ; i< len ; i++) {
            int idx = Math.abs( arr[ i ]) -1 ;
            if ( arr [ idx] > 0 ) { // to avoid multiple iterations if the number is occuring twice.
                arr[ idx ] *= -1 ;
            }
        }
System.out.println(Arrays.toString( arr));
        for ( int i = 0 ; i < len ;i++) {
            if ( arr[i] > 0 ) {
                ans.add( i + 1 ) ;
            }
        }
        return ans;
    }
}

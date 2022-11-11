package Arrays;

import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        // https://leetcode.com/problems/sort-colors/
        int [] arr =  {1};
        System.out.println(Arrays.toString(sort ( arr)));
    }
    public  static  int[] sort ( int [] arr) {
        int zeros  = 0 , ones = 0 , twos = 0 ;
        for ( int digit : arr) {
             if ( digit == 0 ) {
                 zeros++;
             }else if ( digit == 1) {
                 ones++;
             }else {
                 twos++;
             }
        }
        for(int i=0;i<n;i++){
            if(zeros>0){
                nums[i]=0;
                count0--;
            }
            else if(count1>0){
                nums[i]=1;
                count1--;
            }
            else nums[i]=2;
        }
    }
    }
}

package Searching;

import java.util.Arrays;

public class ThreeDigitNumbers {
    public static void main(String[] args) {
        // https://leetcode.com/problems/finding-3-digit-even-numbers/
//        Input: digits = [2,1,3,0]
//        Output: [102,120,130,132,210,230,302,310,312,320]
        int [] arr = {2,1,3,0};
        int [] ans = getAns ( arr);
        System.out.println(Arrays.toString(ans));
    }
    static  int [] getAns (  int [] arr) {
        return new int[]{1,2};
    }
}

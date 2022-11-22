package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class FindIntersection2 {
    public static void main(String[] args) {
        // https://leetcode.com/problems/intersection-of-two-arrays-ii/
        int[] a = {1, 2, 2, 1}, b = {2, 3, 1};
        System.out.println(Arrays.toString(findCommon(a, b)));
    }

    public static int[] findCommon(int[] a, int[] b) {
        // we can sort the arrays and use two pointer approach
        Arrays.sort(a);
        Arrays.sort(b);
        ArrayList<Integer> common = new ArrayList<>();
        int i = 0, j = 0;

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                i++;

            } else if (a[i] > b[j]) {
                j++;
            } else {
                common.add(a[i]);
                i++;
                j++;
            }
        }
        int[]  ans = new int[ common.size()];
        int k = 0 ;
        for ( int m : common) {
            ans[k++] = m ;
        }
        return  ans ;


    }
}

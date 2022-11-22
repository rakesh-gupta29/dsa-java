package Arrays;

import java.util.HashSet;

public class NumJewelsAndStones {
    public static void main(String[] args) {
        // https://leetcode.com/problems/jewels-and-stones/
        String jewels = "z", stones = "ZZ";
        System.out.println(jewelsInStones(jewels, stones));
    }

    public static int jewelsInStones(String a, String b) {
        HashSet<Character> set = new HashSet<>();
        for (char i : a.toCharArray()) {
            set.add(i);
        }
        int counter = 0 ;
        for ( char j : b.toCharArray()) {
            if ( set.contains(j)) {
                counter++;
            }
        }
        return counter ;
    }
}

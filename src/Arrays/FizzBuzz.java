package Arrays;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {
        // https://leetcode.com/problems/fizz-buzz/
        int target = 3;
        System.out.println(fizzBuzz(target));
    }

    static List<String> fizzBuzz(int target) {
        List<String> ans = new ArrayList<>();
        int i =  1  ;
        while (i <= target ) {
            if  (i % 5 == 0 &&  i % 3 == 0) {
                ans.add("FizzBuzz");
            } else if (i % 3 == 0) {
                ans.add("Fizz");

            } else if (i % 5 == 0) {
                ans.add("Buzz");
            } else {
                ans.add(i + "");
            }
           i++ ;
        }
        return ans;
    }
}

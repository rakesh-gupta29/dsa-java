package Strings;

import java.util.Stack;

public class RemoveAdjacentDuplicates {
    public static void main(String[] args) {
        // https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/
        String target = "abbc";
        System.out.println(removeDuplicates(target));
    }

    public static String removeDuplicates(String target) {
        Stack<Character> stack = new Stack<>();
        for ( char letter: target.toCharArray()) {
            if ( stack.isEmpty() || stack.peek() != letter) {
                stack.add(letter);
            }
            else {
                stack.pop();
            }
        }
        // original string is changed
        // create a string
        char[] arr = new char[stack.size()];  // empty array of size stack
        for ( int i = stack.size() ; i > 0 ; i--) {
            arr[i -1 ] = stack.pop(); // insert in rev order
        }
        return new String ( arr ) ;

    }
}

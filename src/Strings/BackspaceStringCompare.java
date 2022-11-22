package Strings;

import java.util.Stack;

public class BackspaceStringCompare {
    public static void main(String[] args) {
        // both are valid anagrams if they are rearranged form of each other.
        String str1 = "ab##";
        String str2 = "c#d#";
        System.out.println(isEqual(str1, str2));
    }

    public static boolean isEqual(String one, String two) {

        Stack<Character> oneStack = new Stack<>();
        for ( char c : one.toCharArray() ) {
            if ( c != '#' && !oneStack.isEmpty()) {
                oneStack.pop();
            }else {
                oneStack.push(c);
            }
        }


        Stack<Character> twoStack = new Stack<>();
        for ( char c : two.toCharArray() ) {
            if ( c != '#' && !twoStack.isEmpty()) {
                twoStack.pop();
            }else {
                twoStack.push(c);
            }
        }
        while ( !oneStack.isEmpty()) {
            char curr = oneStack.pop();
            if ( twoStack.isEmpty() ||  twoStack.pop() != curr) {
                return  false ;
            }
        }
         return oneStack.isEmpty() && twoStack.isEmpty();



    }


}

package Strings;

import java.util.Stack;

public class ValidParenthses {
    public static void main(String[] args) {
        String str = "()[]{}}" ;
        System.out.println(isValid ( str ));

    }
     public static     boolean isValid ( String par) {
         Stack<Character> stack = new Stack<>();
         for ( char c : par.toCharArray()) {
             if (c == '[' || c=='(' || c=='{') {
                 stack.push( c) ;
             }else if ( !stack.isEmpty() && c == ')' && stack.peek() == '(') {
                 stack.pop() ;
             }
             else if ( !stack.isEmpty() && c == '}' && stack.peek() == '{') {
                 stack.pop() ;
             }
             else if ( !stack.isEmpty() && c == ']' && stack.peek() == '[') {
                 stack.pop() ;
             }else {
                 return false ;
             }
         }
         return  stack.isEmpty() ;
     }
}

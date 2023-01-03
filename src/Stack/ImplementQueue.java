package Stack;

import java.util.Stack;

public class ImplementQueue {


}

class MyQueue {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> rev = new Stack<>();
    int len = 0 ;

    public MyQueue () {
    }
    public  void push ( int x) {
        stack.push ( x ) ;
    }

}


package SLL;

import java.util.HashSet;

public class DetectLoop {
    public static void main(String[] args) {
        List list = new List();
        list.appendMany(1,8,3,4);
        Node head = list.getHead();
        list.print(head);
        boolean ans  = getAns(head);
        System.out.println(ans);
    }
    static  boolean getAns( Node  head ){
        Node temp_head = head ;
        HashSet<Integer> set = new HashSet<>();
        while( temp_head.next!= null ){
            if( set.contains(temp_head.value)){
                return true;
            }else {
                set.add(temp_head.value);
                temp_head = temp_head.next;
            }
        }
        return false ;
    }
}

package SLL;

public class SortOddAndEven {
    public static void main(String[] args) {
        List list = new List();
        list.appendMany(1, 2, 3,4,5,6,7);
        Node head = list.getHead();
        list.print(head);

        Node ans_head = removeDuplicates(head);
        list.print(ans_head);
    }

    static Node removeDuplicates(Node head) {
        if ( head == null) return  null;
      Node odd = head , even = head.next, temp = head.next ; //  reference for second next is to kept as this will be changed once head.next id changed via odd.next
      while ( even != null && even.next != null  ) {
          odd.next = even.next ;
          odd = odd.next;
          even.next = odd.next;
          even = even.next;
      }
       odd.next = temp ;

     return head ;
    }
}

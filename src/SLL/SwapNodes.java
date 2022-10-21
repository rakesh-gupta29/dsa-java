package SLL;

public class SwapNodes {
    public static void main(String[] args) {
        // https://leetcode.com/problems/swapping-nodes-in-a-linked-list/
             List list = new List();
             list.appendMany(1,2,3,4,5);
             Node head = list.getHead();
             int k = 2 ;
             Node ansHead = getAns(head , k );
             list.print(ansHead);
    }

    public  static  Node getAns ( Node head , int k  ) {
        Node fast = head , slow = head , first= head , second = head ;
        for ( int i = 0 ;i< k-1 ;i++) {
            // calculation on 0 based index , this has to be at (k-1)th index so we will have to run the loop k-2 times.
            fast = fast.next;
        }
        // fast us at first node for swapping
        first = fast;

        // move untill the last node
        while( fast.next != null) {
            fast = fast.next;
            slow = slow.next ;
        }
        // slow is at second next to be swapped
        second = slow;
        int temp = first.value;
        first.value = second.value;
        second.value = temp;
        return head;
    }
}

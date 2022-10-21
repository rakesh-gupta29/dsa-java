package SLL;

public class SwapNodesInPairs {
    public static void main(String[] args) {
        List list = new List();
        list.appendMany(1,2,3,4);
        Node head = list.getHead();
        Node ansHead = getAns (  head);
        list.print(ansHead);
    }
    public  static  Node getAns ( Node head ) {
        Node dummy = new Node(-10), prev =  dummy , curr = head ;
        dummy.next = head ;
        // created a dummy node
         while ( curr != null &&  curr.next != null ) {
             // next pointer for both nodes are changed.
             prev.next = curr.next; // next node
             curr.next = curr.next.next; // current node
             // prev.next points to current.next so this to be changed to point to current itself that is
             // current.next should point to current itself
             prev.next.next = curr;
             curr = curr.next;
             prev = prev.next.next;
         }
         return dummy.next;
    }
}

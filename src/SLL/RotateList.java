package SLL;

public class RotateList {
    public static void main(String[] args) {
        List list = new List();
        list.appendMany(1, 2, 3, 4, 5);
        Node head = list.getHead();

        int k = 2;
        Node ans_head = rotateList(head, k);
        list.print(ans_head);
    }

    static Node rotateList(Node head, int k) {
        Node p = head, c = head;
        while (k > 0) {
            c = c.next;
            k--;
        }
        while (c.next != null) {
            c = c.next;
            p = p.next;
        }

         Node  newHead = reverse(p.next);
        p.next = newHead;
        p.next = null ;
         newHead = reverse( head ) ;
         p.next = newHead ;


        return head;
    }

    public static Node reverse(Node head) {

        if (head == null || head.next == null) {
            return head;
        }
        Node newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;

    }

}

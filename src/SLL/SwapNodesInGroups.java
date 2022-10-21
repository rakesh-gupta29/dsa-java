package SLL;

public class SwapNodesInGroups {
    public static void main(String[] args) {
        List list = new List();
        list.appendMany(1, 2, 3, 4, 5, 6);
        Node head = list.getHead();
        Node ansHead = getAns(head, 3);
        list.print(ansHead);

    }

    public static Node getAns(Node head, int k) {
        // idea is to reverse the nodes between the x and x+ k nodes.
        // checking that whether next target group is of k nodes atleast.
        Node lenChecker = head, curr = head, prev = null;
        for (int i = 0; i < k; i++) {
            if (lenChecker == null) {
                // if the length is not big enough, just return the head
                return head;
            }
            lenChecker = lenChecker.next;
        }
        for (int i = 0; i < k; i++) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        // at end of this loop , current is pointing to next head.
        // head is now the tail for the reversed linked  list. prev is head for the reverse linked list.
        head.next = getAns(curr, k);
        return prev;

    }


}

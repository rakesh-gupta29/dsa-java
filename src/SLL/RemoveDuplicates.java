package SLL;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List list = new List();
        list.appendMany(1, 2, 2, 3, 3, 3, 4, 5, 6);
        Node head = list.getHead();
        list.print(head);

        Node ans_head = removeDuplicates(head);
        list.print(ans_head);
    }

    static Node removeDuplicates(Node head) {
        Node itr = head;
        while (itr.next != null) {
            if (itr.value == itr.next.value) {
                itr.next = itr.next.next;
            } else {
                itr = itr.next;
            }
        }
        return head;
    }
}

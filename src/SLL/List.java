package SLL;

public class List {
    Node head;

    public void prepend(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;
    }

    public void append(int value) {
        if (head == null) {
            prepend(value);
            return;
        }
        Node itr = head;
        Node node = new Node(value);
        while (itr.next != null) {
            itr = itr.next;
        }
        itr.next = node;
    }

    public void appendMany(int... values) {
        for (int item : values) {
            if (head == null) {
                prepend(item);
                continue;
            }
            Node node = new Node(item);
            Node itr = head;
            while (itr.next != null) {
                itr = itr.next;

            }
            itr.next = node;
        }
    }

    public void print(Node head) {
        Node itr = head;
        while (itr != null) {
            System.out.print(itr.value + " => ");
            itr = itr.next;
        }
        System.out.println("END");
    }

    public Node getHead() {
        return head;
    }

}

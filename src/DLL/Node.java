package DLL;

public class Node {
    int value = 0;
    Node next = null;

    Node(int value) {
        this.value = value;
    }

    Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }

}

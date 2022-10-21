package SLL;

public class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
    }

    Node(int value, Node next) {
        this.next = next;
        this.value = value;
    }
}

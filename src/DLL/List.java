package DLL;

public class List {
     Node head = null;
     public void prepend ( int  value ) {
         Node node = new Node(value);
         node.next = head;
         head = node;
     }
    public void appendMany(int... values) {
        for (int item : values) {
            if (head == null) {
                prepend(item);
                continue;
            }

        }
    }

}

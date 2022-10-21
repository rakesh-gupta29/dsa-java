package SLL;

public class KeepUniques {
    public static void main(String[] args) {
        List list = new List();
        list.appendMany(1,2,2,3,3,3,4,5,6);
        Node head = list.getHead();
        list.print(head);

        Node ans_head  =  keepUnique(head);
        list.print(ans_head);
    }

    public  static  Node  keepUnique ( Node  head ){
        Node itr = head;
        Node isDuplicate = head ;
        while ( itr.next !=null ) {

        }
        return  head;
    }
}

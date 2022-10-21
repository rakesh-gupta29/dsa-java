package SLL;

public class SumNumbers {
    public static void main(String[] args) {
        List list1= new List();;
        List list2 = new List();
        list1.appendMany(4,5);
        list2.appendMany(3,4,5);
        Node head1 = list1.getHead();
        Node head2= list2.getHead();

    }

}

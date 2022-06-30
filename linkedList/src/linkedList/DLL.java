package linkedList;

public class DLL {
	public Node head ;
	public int size ;
	
	public DLL() {
		this.size = 0 ;
	}
		
	public void  prepend ( int value ) {
		Node node = new Node(value);
		node.next = head ;
		if ( head != null ) {
			head.prev = node;
		}
		head = node ;
		size +=1 ;
	}
	
	public void display () {
		Node current = head ;
		while ( current != null ) {
			System.out.print(current.value + " -> ");
			current = current.next;
		}
		System.out.print("END");
		System.out.println();
	}
		
	class Node {
		private int value;
		private Node prev;
		private Node next;
		
		 Node( int value , Node prev , Node next) {
			this.value= value ;
			this.next = next ;
			this.prev = prev ;
		}
		 Node  ( int value ) {
			this.value = value ;
		}
	}
}


package linkedList;


public class LL {
	public Node head ;
	public Node tail;
	public int size ;
	
	public LL () {
		this.size = 0 ;
	}
	
	public void  prepend ( int value) {
		Node node = new Node( value) ;
		node.next = head ;
		head = node ;
		if ( tail == null) {
			tail= head ;
		}
		size += 1;
	}
	
	
	public void append ( int value ) {
		if ( tail == null) {
			prepend( value);
			return;
		}
		Node node = new Node(value);
		tail.next = node ;
		tail = node ;
		size += 1;
		
	}
	
	public void insert ( int value , int index) {
		if ( index == 0) {
			prepend( value);
			return;
		}
		if ( index == size ) {
			append( value);
			return ;
		}
		Node current = head ; 
		int currentIndex = 1;
		while ( current != null ) {
			if ( currentIndex == index ) {
				Node node = new Node ( value, current.next);
				current.next = node ;
			}
			current = current.next;
			currentIndex += 1 ;
		}
	
		size +=1 ;
		
	}
	
	public void insertRec ( int  value , int index ) {
		insertRec( value , index ,head ) ;	
	}
	
	private void insertRec ( int value , int index , Node node ) {
		if ( node == null) {
			return ;
		}
		if ( index ==  0 ) {
			System.out.println( node.value);
		}
		insertRec ( value , index -1 , node.next);
		
	}
	 
	public  void shift () {
		if ( size < 1 ) {
			return ;
		}	
		 head = head.next;
		 if ( head == null) {
			 tail = null; 
		 }
		 size -= 1;
	}

	public void pop ( ) {
		if ( size <= 1) {
			shift();
			return ;
		}
		Node secondLast = get( size-2 );
		tail = secondLast ;
		tail.next = null ;
		size -= 1 ; 
	}
	
	public void delete ( int index ) {
		if ( index == 0 ) {
			shift();
			return;
		}
		if ( index == size -1) {
			pop();
			return ;
		}
		if ( index < size -1) {
			Node prev = get( index -1 );
			prev.next = prev.next.next;
		}
		
		
	}
	
	public Node get( int index ) {
		if ( index < 0 ) {
			return null;
		}
		Node current = head ;
		int currentIndex = 0 ;
		while ( current != null) {
			if( currentIndex == index ) {
				return current;
			}
			currentIndex +=1 ;
			current = current.next;
		}
		return null ;
	}
	
	public void print () {
		Node current =  head ;
		while ( current != null) {
			System.out.print(current.value + " -> ");
			current = current.next;
		}
		System.out.print("NULL");
		System.out.println();
	}
	
	class Node {
		public int value ;
		private Node next;
		public Node ( int value ) {
			this.value = value ;
		}
		public Node ( int value , Node next ) {
			this.value = value;
			this.next = next;
		}
	}
}

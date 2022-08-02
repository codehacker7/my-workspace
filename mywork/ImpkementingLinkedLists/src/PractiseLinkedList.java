
public class PractiseLinkedList<E>{

//add first, add last,add ,add(int index,E	e)
	
	Node<E> head,tail;
	private int size;
	
	public int size() {
	return size;
	}
	
	public void addFirst(E e) {
		Node<E> newnode = new Node(e);
		
		if(size==0) {
			head = tail = newnode;
		}
		else {
		newnode.next = head;
		head = newnode;
		}
		
		size++;
	
	}
	
	
	public void addLast(E e) {
		Node<E> newnode = new Node(e);
		
		if(size==0) {
			head = tail = newnode;
		}
		
		else if(size==1) {
			head.next = newnode;
			tail = newnode;
			
		}
		else {
			tail.next = newnode;
			tail = newnode;
		}
		
		size++;
	}
	
	
	public void add(E e) {
		addLast(e);
	}
	
	public void add(int index,E	e) {
		Node<E> newnode = new Node(e);
	
		Node<E> prev = head;
		
		for(int i=0;i<index;i++) {
			prev = prev.next;
		}
		newnode.next = prev.next;
		prev.next = newnode;
		size++;
	
	
	}
	
	
	public E removeFirst() {

		
		if(size==1) {
			return null;
		}
		else {
		
		
		E e = head.element;
		
		head = head.next;
		
		return e;		
	
		
		
		}
		}
	
	
	
	public E removeLast() {
		Node<E> prev = head;
		E last = tail.element;
		for(int i=0;i<size-2;i++) {
			prev = head.next;
		}
		tail = prev;
		tail.next = null;
		
		return last;
		
	}
	
	
	


public class Node<E>{
	
	E element;
	Node<E> next;
	
	public Node(E e) {
		element = e;
	}
	
}	
	
}
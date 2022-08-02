

public class MyLinkedList<E>{
	
	private Node<E> head,tail;
	private int size;
	
	public int size() {
		
		return size ;
	
	
	}
	
	
	private boolean isEmpty() {
		return size==0;
	}
	
	public void addFirst(E e) {
		Node<E> n = new Node<>(e);
		
		
		
		if(isEmpty()){
			tail = head =n;
		}
		else {
			n.next = head;
			head = n;
		}
		
		
		size++;
		
		}
	
	
	
	public void addLast(E e) {
		Node<E> n = new Node<>(e);
		
		if(isEmpty()) {
			tail = head = n;
		}
		
			tail.next = n;
			tail = n;
		
		
	}
	
public void add(E e) {
		addLast(e);
	}
	
public void add(int idx,E e) {
	
	if(idx<0 || idx>size) {
		throw new IndexOutOfBoundsException();
	}
	
	
	else if(idx==0) {
		addFirst(e);
	}
	else if(idx==size)
		addLast(e);
	
	
	else {
	
	Node<E> n = new Node<>(e);
	Node<E> prev = head;
	
	for(int i=0;i<idx-1;i++) {
		prev = prev.next;
	}
	
	n.next = prev.next; //1
	prev.next = n;
	
	size++;
	
	}
}
	
	
	
	
	
	
	
	
}


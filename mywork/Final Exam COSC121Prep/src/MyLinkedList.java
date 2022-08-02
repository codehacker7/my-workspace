import java.util.Iterator;

public class MyLinkedList<E> {

	Node<E> head,tail=null;
	private int size =0;
	
	public int getsize() {
		return size;
	}
	public boolean isEmpty() {
		return size==0;
	}
	
	public void addFirst(E element) {
		Node<E> newNode = new Node<>(element);
		
		if(isEmpty()) {
			head = tail = newNode;
		}
		else {
		newNode.next = head;
		head = newNode;
	}
		
	
	
	
	}
	
	
	
	public void addLast(E element) {
		
		
		Node<E> newNode = new Node<>(element);
		
		if(isEmpty()) {
			head = tail = newNode;
		}
		
		else {
			
			tail.next = newNode;
			
			tail = newNode;
			
			
			
		}
		
		
		
	}
	
	public void add(int index,E element) {
		
		// 1 2 3 4 5
		
		Node<E> newNode = new Node<>(element);
		
		Node<E> current = head;
		
		for(int i=0;i<index-1;i++) {
			current = current.next;
		}
		newNode.next = current.next;
		current.next = newNode;
		
		
		size++;
		
	}
	
	public E removeFirst() {
		
		
		
		E returning = head.element;
		
		if(isEmpty()) {
			return null;
		}
		
		else {
		
		head = head.next;
		
		
		if(head ==null)
			tail =null;
		
		
		
		return returning;
		}
		
		
	}
	
	
	
	public E removeLast() {
		
		E returning = tail.element;
		
		Node<E> temp = head;
		// 1 2 3 4 5 
		for(int i=0;i<size-2;i++) {
			temp = temp.next;
		}
		tail =  temp;
		temp.next = null;
		
		size--;
		
		
		
		
		return returning;
		
	}
	
	
	

	public E remove(int index) {
		
		
		
		
		Node<E> current = head;
		
		for(int i=0;i<index-1;i++) {
			current = current.next;
		}
		Node<E> prev = current.next;
		
		
		
		current.next = prev.next;

		
		return prev.element;
		
		
		
		
		
		
	}
	
	
	
	
	public Iterator iterator() {
		
		
		
		
		return new MyIterator();
		
		
		
		
		
		
		
	}
	
	public class MyIterator implements Iterator {

		Node<E> current = head;
		
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return current==null;
			
		}

		@Override
		public Object next() {
			// TODO Auto-generated method stub
		Node<E> prev = current;
		current = current.next;
		return prev.element;
		}
		
		
		
		
		
		
		
	}
	
	
	public class Node<E>{
		
		E element;
		Node<E> next;
		
		
		public Node(E e) {
			element = e;
		}
		
		
	}
}

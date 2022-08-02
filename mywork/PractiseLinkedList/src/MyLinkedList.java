import java.util.Iterator;

public class MyLinkedList<E> {

Node<E> head,tail;	
private int size;
	
	public E remove(int index) {
		Node<E> curr = head;
		
		if(index>=size) {
			throw new IndexOutOfBoundsException();
		
		}
		
		
		else {
		for(int i=1;i<index;i++) {
			curr = curr.next;
			
		}
		
		
		Node<E> removal = curr.next;
		
		curr.next= removal.next;
		size--;
		return removal.element;
		
	}
	}
	
	public void addFirst(E e) {
		
		Node<E> newNode = new Node<>(e);
		
		
		
		if(size==0) {
			head = tail = newNode;
		}
		else {
			newNode.next = head;
			head = newNode;
		}
		size++;
	}
	
	
	
	public void addLast(E e) {
		Node<E> newNode = new Node<>(e);
		
		if(size==0) {
			head = tail = newNode;
		}
		else {
		
		tail.next = newNode;
		 
		 tail = newNode;
		}
		
		size++;
		
	}
	
	public void add(int index,E e) {
		
		
		
		if(index<0 || index>=size) {
			throw new IndexOutOfBoundsException();
		}
		
		
		
		else if(index==0) {
			addFirst(e);
		}
		
		
		else if(index==size-1) {
			
			
			addLast(e);
			
		}
		
		else {
			Node<E> newNode = new Node<>(e);
			Node<E> curr = head;
			for(int i=1;i<index;i++) {
				curr = curr.next;
			}
			
			newNode.next = curr.next;
			curr.next = newNode;
		}
	
	
	
	
	
	size++;
	
	
	}
	
	public void add(E e) {
		
		addLast(e);
		
		
	}
	
	public void display() {
		Node<E> curr = head;
		for(int i=0;i<size;i++) {
			System.out.print(curr.element+" ");
			curr= curr.next;
		}
		
		
	}
	
	public E getFirst() {
		
		return head.element;
		
		
		
		
	}
	
	
	public E getLast() {
		return tail.element;
	}
	
	
	
	public E get(int index) {
		
		Node<E> curr = head;
		for(int i=1;i<index;i++) {
			curr = curr.next;
		}
		
		
		return curr.next.element;
		
	}
	
	public Iterator<E> iterator() {
		return new MyIterator();
		
	}
	
	public class MyIterator implements Iterator<E>{
Node<E> curr = head;
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return (curr!=null);
		}

		@Override
		public E next() {
			// TODO Auto-generated method stub
			Node<E> temp = curr;
			curr=curr.next;
			return temp.element;
		}
		
		
		
		
		
	}
	
	
	
	
	
	private class Node<E>{
		private Node<E> next;
		private E element;
			public Node(E e) {
				element = e;
			}
	}
}

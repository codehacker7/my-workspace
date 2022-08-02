import java.util.Iterator;

public class MyLinkedList<E> {

	private Node<E> head,tail;
	private int size;
	
	
	public int size() {
		return size;
	}
	public boolean isEmpty() {
		return size==0;
	}
	public void addFirst(E e) {
		
		if(size==0) {
		Node<E> newnode = new Node(e);
		head=tail=newnode;
		}
		
		else {
		Node<E> newnode = new Node(e);
		newnode.next = head;
		head = newnode;
		}
		
		size++;
	}
	
	
	public void addLast(E e) {
		
		
		Node<E> newnode = new Node(e);
		if(size==0) {
			head=tail=newnode;
		
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
	
	public void add(int idx,E e) {
		
		
		if(idx<0 || idx>size) {
		throw new IndexOutOfBoundsException();
		}
		else if(idx==0) {
			addFirst(e);
		}
		
		else if(idx==size) {
			addLast(e);
		}
		else {
		
		Node<E> newnode = new Node(e);
		
		Node<E> previous = head;
		
		for(int i=0;i<idx;i++) {
			previous = previous.next;
		}
		
		
		newnode.next = previous.next;
		previous.next = newnode;
		size++;
		
		}
	}
	
	public E removeFirst() {
	if(head==null) {
		return null;
	}
	else {
		Node<E> temp = head;
		head= head.next;
	if(head==null) { // this is a specific case in which list has just one element
		tail =null;
	}
	
	size--;
	
	return temp.element;
	}
	
	}
	
	
	public E removeLast() {
		Node<E> temp = tail;
		
		
		if(head==null) {
			return null;
		}
		else if(size==1) {
			return removeFirst();
		}
		else 
		{
		int idx = size();
		
		Node<E> previous =head;
		
		for(int i=0;i<idx-2;i++) {
			previous=previous.next;
		}
		tail=previous;
		tail.next = null;
		size--;
		
		return temp.element;
		}
	}
	
	public E remove(int index) {
		
		if(index<0 ||index>=size)
			return null;
		
		if(index==0) {
			return removeFirst();
		}
		else if(index==size-1) {
			return removeLast();
		}
		else {
		Node<E> prev = head;
		
		for(int i=0;i<index-1;i++) {
			prev = prev.next;
		}
		Node<E> current =prev.next;
		
		prev.next = current.next;
		
		size--;
		
		
		return current.element;
		}
		
		
		
	}
	public E getFirst() {
		if(size==0)
			return null;
		else {
			return head.element;
		}
	}
	
	
	public E getLast() {
		if(size==0) {
			return null;
		}
		else {
			return tail.element;
		}
	}
	
	
	public E get(int index) {
	
		if(index<0 || index>=size) {
			return null;
		}
		else if(index==0) {
			return getFirst();
			
		}
		else if(index==size-1) {
			return getLast();
		}
		else {
		Node<E> curr = head;
		for(int i=0;i<index;i++) {
			curr = curr.next;
			}
		return curr.element;
		}

	}
	
	public Iterator<E> iterator(){
		return new MyIterator();
		
	}
	
	private class MyIterator implements Iterator<E>{
		private Node<E> curr;
		public MyIterator() {
			curr=head;
		}
		
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return (curr!=null);
		}

		@Override
		public E next() {
			// TODO Auto-generated method stub
			E temp = curr.element;
			curr = curr.next;
			
			return temp;
		}
		
	}
	
	
}

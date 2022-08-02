
public class PractiseLinkedList<E> {

	private Node<E> head,tail;
	private int size;
	
	public void addLast(E e) {
		Node<E> n = new Node<E>(e);
		
		
		tail.next = n;
		tail=n;
		
		size++;
		
		
	}
	
	
	public void add(int index,E e) {
	
		
		Node<E> n = new Node<E>(e);
		
		Node<E> prev = head;
		
		for(int i=0;i<index-1;i++) {
			prev = prev.next;
		}
		
		n.next = prev.next;
		prev.next = n;
		
		size++;
		
		
}
	
	

	
	
	public E remove(int idx) {
		
		Node<E> prev = head;
		Node<E> current = head;
		
		for(int i=0;i<idx-1;i++) {
			prev=prev.next;
			
		}
	current = prev.next;	
		prev = prev.next.next;
		size--;
		
		return  current.element;
		
		
	}
	
	
	public void addFirst(E e) {
		
		Node<E> n = new Node<>(e);
		
		
		n.next = head;
		head = n;
		
	}
	
	
}

import java.util.*;
public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
		
		
		
Queue<Customer> queue = new LinkedList();		


// Here we cannot refer to new Queue as queue is an interface not an class

queue.offer(new Customer(1,"Bob"));
queue.offer(new Customer(3,"Lily"));
queue.offer(new Customer(2,"Mark"));


while(!queue.isEmpty()) {
	System.out.println(queue.poll().getName()+" was served");
}




	}

}

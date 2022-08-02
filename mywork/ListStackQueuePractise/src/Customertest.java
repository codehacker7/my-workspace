import java.util.LinkedList;
import java.util.*;

public class Customertest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Queue<Customer> c1 = new LinkedList<>();
		
		
		c1.offer(new Customer("Bob",1));
		c1.offer(new Customer("Kavyansh",2));
		c1.offer(new Customer("Pratham",3));
	
	while(!c1.isEmpty()) {
		System.out.println(c1.poll().getName()+" was served");
	}
	
	
	
	
	
	
	
	
	
	}

}

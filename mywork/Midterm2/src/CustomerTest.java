import java.util.LinkedList;
import java.util.Queue;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<Customer> c = new LinkedList<>();

		
		c.offer(new Customer("Kavyansh",1));
		c.offer(new Customer("Bob",3));
		c.offer(new Customer("Bob45",2));
		
		
		
		
		while(!c.isEmpty()) {
		System.out.println(c.poll().getName()+"was served");
		}
	}

}

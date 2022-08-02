import java.util.LinkedList;
import java.util.Queue;

public class QueuePractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<Integer> c = new LinkedList<>();



reversequeue(c);


System.out.println(c);
	}
	
	
	
	public static Queue<Integer> reversequeue(Queue<Integer> c) {
		
		
	
		c.offer(1);
		c.offer(2);
		c.offer(3);
		c.offer(4);
		c.offer(5);

		
		
		// 1 2 3 4 5 

		if(c.isEmpty()) {
		
			return c;
		}

		else {
			
			int element = c.peek();
			c.poll();

			c = reversequeue(c);
			c.add(element);
		
			return c;
			
		
			
		}
		
	
		
		
		
		
	}
}
	
	
	
//	public class Queue_reverse {
//		  
//	    static Queue<Integer> queue;
//	  
//	    // Utility function to print the queue
//	    static void Print()
//	    {
//	        while (!queue.isEmpty())
//	        {
//	            System.out.print(queue.peek() + " ");
//	            queue.remove();
//	        }
//	    }
//	  
//	// Recurrsive function to reverse the queue
//	static Queue<Integer> reverseQueue(Queue<Integer> q)
//	{
//	    // Base case
//	    if (q.isEmpty())
//	        return q;
//	 
//	    // Dequeue current item (from front) 
//	    int data = q.peek();
//	    q.remove();
//	 
//	    // Reverse remaining queue 
//	    q = reverseQueue(q);
//	 
//	    // Enqueue current item (to rear) 
//	    q.add(data);
//	         
//	    return q;
//	}
//
//}

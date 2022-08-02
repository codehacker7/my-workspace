import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Clicker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	PriorityQueue<Integer> queue= new PriorityQueue<Integer>(Arrays.asList(60,10,50,30,40,20));
	
//Queue<Integer> queue= new LinkedList<Integer>(Arrays.asList(60,10,50,30,40,20));
	
	
	
	while(!queue.isEmpty()) {
		System.out.println(queue.poll()+" ");
	}
	
	
	
	}

}

import java.util.*;
public class RobotTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		
//		Queue<Robot> queue = new PriorityQueue<>();
//
//	queue.offer(new Robot(30,2000));
//	queue.offer(new Robot(10,2020));
//	queue.offer(new Robot(70,2010));
//	
//	
//	while(!queue.isEmpty())
//	System.out.println(queue.poll().toString());
//	}
	
	// now lets say i want to compare by year

	
	Queue<Robot> queue = new PriorityQueue<>(new RobotComparator());

queue.offer(new Robot(30,2000));
queue.offer(new Robot(10,2020));
queue.offer(new Robot(70,2010));


while(!queue.isEmpty())
System.out.println(queue.poll().toString());
}
		
		
		
		

}

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Q1_1 {

	public static void main(String[] args) {
		
		
		LinkedList<Integer> x = new LinkedList<>();
		
		long startTime = System.currentTimeMillis(); 
		
		
		for(int i=0;i<100000;i++) {
			int m = (int)Math.random()*100000;
		x.add(m);
		
		}
		
		
		
		ListIterator<Integer> y = x.listIterator();
		
		
		while(y.hasPrevious()) {
			System.out.println(y.previous());
		}
		
		
		
		
	}
	
	
}

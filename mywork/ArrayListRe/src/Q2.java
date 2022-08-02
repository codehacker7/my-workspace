import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 ArrayList<String> list = new ArrayList<>(Arrays.asList("A","B","C","D"));
		
		
		//using list iterator
		// we can move both forward and backward using list iterator
		
		
//		ListIterator<String> it = list.listIterator();
		
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
//		System.out.println();
//		while(it.hasPrevious()) {
//			System.out.println(it.previous());
//		}
		// we can also place an listiterator at a specific place
		
		ListIterator<String> y = list.listIterator(2);		
		
		// now our iterator is pointing at the index 2 so you can use add function to add "X"
		y.add("X");
	System.out.println(list);
		
	
	String x = y.previous();
y.set("w");
	//you see that we read last element C and then we used y.previous so u can replace it withW
		
		
	}

}

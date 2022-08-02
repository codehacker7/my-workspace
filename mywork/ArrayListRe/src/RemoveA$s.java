import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;



public class RemoveA$s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ArrayList<String> x = new ArrayList(List.of("A","A","B","A"));
	
	while(x.contains("A"))
		x.remove("A");
	
	// The above code is not efficient as contains iterators over each and every element form the beginning so if A is present at the end of the list then a lot of time that means we need to iterate over N elements
	// Moreover remove methods after removing shifts all elements so here also we need to iterate over N elemnts
	
	// so the code efficiency is proportional to N^2
	//In compsci it is represented as O(N^2)
	
	
	// Solution 2
	x.removeAll(Arrays.asList("A"));
	// It is very efficient
	
	
	
	
	//Solution 3
	
	Iterator<String> it = x.iterator();
	
	while(it.hasNext()) {
		if(it.next().equals("a"))
			it.remove();
	}
	
	
	
	
	
	
	}
	

}

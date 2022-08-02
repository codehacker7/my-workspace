import java.util.ArrayList;
import java.util.Iterator;



public class Q1 {

	
	public static void main(String[] args) {
		
		
		ArrayList<String> x = new ArrayList<>();
		
		x.add("A");
	
		x.add("B");

		for(int i=0;i<x.size();i++) {
			System.out.println(x.get(i));
		}
		
		
		
		Iterator<String> y = x.iterator();
		
		while(y.hasNext()) {
			
		}
		
		
		
	}
}

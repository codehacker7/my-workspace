import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListpractise {

	public static void main(String[] args) {
		
		
		
		ArrayList<Integer> x = new ArrayList<>();		
		
	
	Scanner input= new Scanner(System.in);
	
	System.out.println("Enter the value: ");
	int value = input.nextInt();
	
	while(value!=0) {
		//ArrayList<Integer> x = new ArrayList<>();		
		if(!x.contains(value)) {
			x.add(value);
		}
		
		
	}
	
	for(int i=0;i<x.size();i++) {
		System.out.println(x.get(i));
	}
	
		
	}
	
	
	
	public static void useiterator(ArrayList<Integer> x)
	{
		ListIterator<Integer> c = x.listIterator();
		
		while(c.hasPrevious()) {
			System.out.println(c.previous());
		}
		
		
		
		while(c.hasNext()) {
			int n = c.next();
			System.out.println(c.next());
		
		}
		
		
		
		
	}
	
	
	
}

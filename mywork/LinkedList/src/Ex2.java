import java.util.ArrayList;
import java.util.LinkedList;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		ArrayList<String> list = new ArrayList<>();
		
		LinkedList<String> list = new LinkedList<>();
		
		//Ad shown below both the arraylist and linkedlist exactly show the same output
		//as both of them implement the same interfaces
		
		list.add("A");
		list.add("B");
		list.add("C");
		
		list.set(0, "X");
		list.add("D");
		System.out.println(list);
		System.out.println(list.indexOf("C"));
		System.out.println(list.indexOf("Z"));
		System.out.println(list.remove("Z"));
		System.out.println(list.remove("C"));
		System.out.println(list);

	
	}

}

import java.util.ArrayList;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList list = new ArrayList(3);
		
		list.add(5);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add("kavyansh");
		
		System.out.println(list.toString());
		
		//Here we are restricting the arraylist to Integer
		
		ArrayList<Integer> list2 = new ArrayList<Integer>(3);
		
		//Say we want to acces a particular element inside arrayList so
		
		int x = (int)list.get(2);
		
		System.out.println(x);
	}

}

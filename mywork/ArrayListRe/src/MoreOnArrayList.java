import java.util.ArrayList;

public class MoreOnArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Double> list = new ArrayList<>();
		
		list.add(5.5);
		list.add(new Double(5.5));
		
		list.add(Double.valueOf(5.5));
		
		
		// Question is Double is a type of ObjectWrapper
		// sp how are you able to primitives like 5.5 inside an Object
		
		// so java automatically converts list.add(5.5) into new Double(5.5), this is called auto boxing
		
		
		
		
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(3);
		list1.add(0,9);
	//	list.remove(9);
		// this is an error as java searches for index 9 and no index 9
		// java removes by 2 methods either by int index or by value and java does method matching to match the arguments
		
		list.remove(Integer.valueOf(9));
		
		
	}

}

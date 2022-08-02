import java.util.ArrayList;
import java.util.Arrays;

public class Experiment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// this was coping from  array to arraList
		String[] arr = {"red","green","blue"};
		
		ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
		
		
		
		
		// Coping from ArrayList to array
		
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("A");
		list1.add("B");
		list1.add("C");
		
		String[] arr2 = new String[list1.size()];
		list1.toArray(arr2);
		
		
		
		
	}

}

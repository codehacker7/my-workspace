import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ArrayList<String> list = new ArrayList<>(List.of("A","B","C"));
	ArrayList<String> list2 = new ArrayList<>(List.of("A","B","C"));
		
		System.out.println(list.equals(list2));
		
		// you can also use Arrays.asList instead of List.of
		
	}

}

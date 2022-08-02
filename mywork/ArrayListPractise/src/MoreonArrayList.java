import java.util.ArrayList;
import java.util.*;
public class MoreonArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Object> x = new ArrayList<>(Arrays.asList("A"));
		
		Iterator<Object> y = x.listIterator();
		
		while(y.hasNext()) {
			Object m = y.next();
			System.out.println(m);
		}
		
		
	}

}

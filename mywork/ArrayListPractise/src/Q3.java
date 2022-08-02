import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum =0;
	
		ArrayList<Integer> x = new ArrayList<>(Arrays.asList(1,2,3,4));
		
		
		Iterator<Integer> y = x.listIterator();
		
		while(y.hasNext()) {
			int x2 = y.next();
			sum+=x2;
		}
		System.out.println(sum);
	}

}

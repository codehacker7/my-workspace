import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;



public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3,2,6,9));
		
		int sum =0;
		
		// for i
		for(int i=0;i<list.size();i++) {
			sum+=list.get(i);
		}
		
		sum=0;
		for(int item:list) {
			sum+=item;
		}
		sum =0;
		
		
		Iterator<Integer> it = list.iterator();
		
		while(it.hasNext())
		sum+=it.next();
		System.out.println(sum);
	}

}

import java.util.ArrayList;
import java.util.Arrays;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	union(new ArrayList<Integer>(Arrays.asList(1,2,3,4)),new ArrayList<Integer>(Arrays.asList(4,6,7,8)));
		System.out.println(	union(new ArrayList<Integer>(Arrays.asList(1,2,3,4)),new ArrayList<Integer>(Arrays.asList(4,6,7,8))));
		
	}

	
	
public static ArrayList<Integer> union(ArrayList<Integer> list1,ArrayList<Integer> list2){
	
	
	ArrayList<Integer> x = new ArrayList<>();


		for(int i=0;i<list1.size();i++) {
			if(!x.contains(list1.get(i))) {
				x.add(list1.get(i));
			}
		}

	



	for(int i=0;i<list2.size();i++) {
		
		if(!x.contains(list2.get(i))) {
			x.add(list2.get(i));
		}
	
	
	
	}
	
	
	return x;





}
	
	
	
	
	
	
	
	
	
	
}

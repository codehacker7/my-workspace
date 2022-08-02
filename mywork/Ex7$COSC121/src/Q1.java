import java.util.ArrayList;
import java.util.Iterator;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		ArrayList<Object> x = new ArrayList<>();
		x.add(new Robot(100,2020));
		x.add(new Robot(300,2021));
		x.add(new Robot(200,2022));
		
		
		
//	for(int i=0;i<x.size();i++) {
//		System.out.println(x.get(i).toString());
//	}
//	
	
	Iterator<Object> y = x.iterator();
	
	while(y.hasNext()) {
		System.out.println(y.next().toString());
	}
	
	
	
	
	}

}

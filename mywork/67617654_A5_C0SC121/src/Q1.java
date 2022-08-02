import java.util.ArrayList;
import java.util.List;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Object> x = new ArrayList<>(List.of(1,2,3)) ;

ArrayList<Object> y = new ArrayList<>(List.of(2,3,4)) ;


myretainAll(x,y);
	}



public static double seriescalculator(int i) {
	
	
	// this should be the base case that we are looking for as soon as the value of i reaches 1 stopping condition is reached
	if(i==1) {
		return 1.0/2;
	}
	// in this condition we are just adding a fraction and calling the method again with the help of recurssion 
	else {
		return (double)1/(2*i)+ seriescalculator(i-1);
	}
}

public static boolean myretainAll(ArrayList<Object> list,ArrayList<Object> other) {
	int q =0;
	
	for(int i=0;i<list.size();i++) {
		if(other.contains(list.get(i))) {
		list.add(q,list.get(i));q++;
		}
		else {
			list.remove(i);
		}
		
		
	}
	System.out.println(list);
	
	return true;
}



}

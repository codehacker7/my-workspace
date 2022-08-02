import java.util.ArrayList;
import java.util.Scanner;


public class Practisequestion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		ArrayList<Integer> list = new ArrayList<>();
	Scanner r = new Scanner(System.in);
	
	System.out.println("Enter an int ; o to end");
	int value = -1;
	
	while(value!=0) {
		value=r.nextInt();
	
		if(value!=0 && !list.contains(value) ) {
			list.add(value);
		}
	
	}
	
	System.out.println(list);
	
	
	
	
	
	
	
	}
	
	
	}



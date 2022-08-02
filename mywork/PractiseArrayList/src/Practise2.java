import java.util.ArrayList;
import java.util.Scanner;
public class Practise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	
	ArrayList<Integer> x = new ArrayList<>();
		
		Scanner r = new Scanner(System.in)
;		
		
		System.out.println("Enter the integers(input ends with 0): ");

		int y =1;
		
		while(y!=0) {
				y= r.nextInt();
		
		if(!x.contains(y) && y!=0) {
			x.add(y);
		}
		
		//r.nextLine();
		
		}
		
		System.out.println(x);
		
		
		
		
	}

}

import java.util.ArrayList;
import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner r = new Scanner(System.in);
	
	ArrayList<Integer> list = new ArrayList<>();
		System.out.println("Enter integers(input ends with 0): ");
	
	int value=0;
while((value=r.nextInt())!=0) {

	if(!list.contains(value)) {
		list.add(value);
		
	}
	
	
}
	
	
	
	
	}

}

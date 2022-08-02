import java.util.InputMismatchException;
import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner r = new Scanner(System.in);
		
		boolean done = false;
		
		while(!done) {
		try {
		System.out.println("Enter your age: ");
		int x = r.nextInt();
		done = true;
		
		}catch(InputMismatchException e) {
			System.out.println("Wrong type please try again");
			r.nextLine();
		}
		}
		
	}

}

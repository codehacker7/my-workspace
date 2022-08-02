import java.util.InputMismatchException;
import java.util.Scanner;

public class Errordealing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner r = new Scanner(System.in);
		System.out.println("How old are you?");

		boolean done = false;
	
		
		
		
		while (!done) {
			try {
				int age = r.nextInt();
				while (age <= 0) {
					System.out.println("Age must be positive please try again");
					age = r.nextInt();
				}
				System.out.println("great work");
				done = true;
			} catch (InputMismatchException e) {
				System.out.println("Age must be Integer Try again: ");
					r.nextLine();
			}	
		}

		
		r.close();
	}

}

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner r = new Scanner(System.in);
	
	System.out.println("3Enter a simple mathematical formula: ");
	String b="";
	boolean done = false;
	double a=0;
	double c=0;
	while(!done) {
		try {
	 a = r.nextDouble();
	b = r.next();
	 c = r.nextDouble();

	}catch(InputMismatchException e) {
		System.out.println("Invalid number format. Try again.: ");
		
		r.nextLine();
		continue;
	}
	
		if(b.equals("+") || b.equals("-") || b.equals("/") || b.equals("*")) {
			done = true;
			
		}

		else {
			System.out.println("Invalid Operator.Try again: ");
			
		}
	
	
	}

	if(b.equals("+"))
	System.out.println("Result: "+(a+c));
	
	else if(b.equals("-"))
	System.out.println("Result: "+(a-c));
	else if(b.equals("*"))
	System.out.println("Result: "+(a*c));
	else if(b.equals("/"))
	System.out.println("Result: "+(a/c));
	
	}

}

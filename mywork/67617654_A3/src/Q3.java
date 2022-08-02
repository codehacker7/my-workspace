import java.util.InputMismatchException;
import java.util.Scanner;

public class Q3 {
public static void main(String[] args) {
Scanner r = new Scanner(System.in);
	
	System.out.println("Enter a simple mathematical formula: ");
	String b="";
	boolean done = false;
	String a="";
	String c="";
	 double x=0;
	 double y=0;

	 
	 /* Here in this question we encounter Number format exception this exception is thrown when we try to convert a string
	 
	  into a numeric value but the string is not of appropriate type
	 */
	 
	 do {
		 try {
			 a = r.next();
			 b=r.next();
			 c = r.next();
			 x =Double.parseDouble(a);
		  y = Double.parseDouble(c);
		 
	 
		 }catch( NumberFormatException e) {
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
	
	 }while(!done);
	 
	 
	 if(b.equals("+"))
	System.out.println("Result: "+(x+y));
	
	else if(b.equals("-"))
	System.out.println("Result: "+(x-y));
	else if(b.equals("*"))
	System.out.println("Result: "+(x*y));
	else if(b.equals("/"))
	System.out.println("Result: "+(x/y));
	
	}

}


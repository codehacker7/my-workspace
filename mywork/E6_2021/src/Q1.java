import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner r = new Scanner(System.in);
	//ystem.out.println(m(4));
	
System.out.println("Enter your age: ");
int  x= r.nextInt();

r.nextLine();

System.out.println("Enter your name: ");
String n = r.nextLine();




	
	
	System.out.println("The age of " + n + " is " + x);

	
	
	
	}



public static double m(int i) {
	

	if(i==1) {
		return 1.0/2;
	}
	else {
	
	return (double)i/(i+1) + m(i-1);
	}
	

	
   
		
}



}

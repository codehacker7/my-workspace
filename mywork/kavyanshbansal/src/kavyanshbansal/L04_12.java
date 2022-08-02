package kavyanshbansal;

import java.util.Scanner;

public class L04_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner r = new Scanner(System.in);

			System.out.println("Enter the 3 sides of triangle a\n b\n c");
			int a=r.nextInt();
			int b=r.nextInt();
			int c=r.nextInt();
			
			double A= a*Math.cos((a*(a-b)*(b-c)*c)/(-2*b*c));
			
			double B= a*Math.cos((b*(b-a)*(a-c)*c)/(-2*a*c));
			
			double C= a*Math.cos((c*(c-b)*(b-a)*a)/(-2*a*b));
			
			System.out.printf("The angles of triangle is %10f%10f%10f",A,B,C);
		
		
			
	}

}

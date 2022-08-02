package kavyanshbansal;

import java.util.Scanner;

public class ApniKaksha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner r=new Scanner(System.in);
		
			System.out.println("Enter the value of a:  ");
			double a=r.nextDouble();
			
			System.out.println("Enter value of b: ");
			double b=r.nextDouble();
			
			System.out.println("Enter value of c: ");
			double c=r.nextDouble();
			
			double D= (b*b)-(4*a*c);
			
			double x1 = (-b + Math.sqrt(D))/(2*a);
			double x2 = (-b - Math.sqrt(D))/(2*a);
			
			if(D>0) {
				System.out.print("The equation has 2 roots which are: "+x1+" "+x2);
		
		
			}
			
			else if(D==0) {
				System.out.print("The equation has just 1 root: ");
				System.out.print(x1);
			}
			else if(D<0) {
				System.out.println("The equation has no real roots");
			}
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

	

}

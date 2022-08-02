import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
			     Scanner r=new Scanner(System.in);
	
	
				System.out.println("Enter the three sides of triangle");
				double side1=r.nextDouble();
				double side2=r.nextDouble();
				double side3 =r.nextDouble();
				
				
				  while(isValid(side1,side2,side3)==false) {
					     System.out.println("Invalid Input try again: ");
					     side1=r.nextDouble();
						 side2=r.nextDouble();
						 side3 =r.nextDouble();
						 }
	         System.out.println("The area of the mentioned sides is "+area(side1,side2,side3));
				
	}

		public static boolean isValid(double side1,double side2, double side3) {
			
				if((side1+side2)>side3   && (side2+side3)>side1 && (side3+side1)>side2)
					return true;
		
		        return false;
	}
		
			public static double area(double side1,double side2,double side3) {
				
					double s = (side1+side2+side3)/2;
					double check = s*(s-side1)*(s-side2)*(s-side3);
					double area = Math.sqrt(check);
					return area;
			}
}

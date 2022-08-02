package kavyanshbansal;

import java.util.Scanner;

public class Number2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner r=new Scanner(System.in);
			
			System.out.println("Enter your weight and height in cm");
			double weight=r.nextInt();
			double height=r.nextInt();
		
			
		    height =0.01*height;	
		
			
			double BMI = weight/Math.pow(height,2);
			System.out.println(BMI);
			
			if(BMI<18.5) {
				System.out.println("Underweight");
			}
			
			else if(BMI>=18.5 && BMI<25.0) {
				System.out.println("Normal");
			}
			
			else if(BMI>=25 && BMI<30) {
				System.out.println("Overweight");
			}
	
			else if(BMI>=30) {
				System.out.println("Obese");
			}
	
	
	
	
	
	
	
	
	
	
	
	
	}

}

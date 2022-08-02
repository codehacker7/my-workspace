package kavyanshbansal;

import java.util.Scanner;

public class SortingwIithoutsorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner r=new Scanner(System.in);
		
			System.out.println("Enter the three integers: ");
			int num1=r.nextInt();
			int num2=r.nextInt();
			int num3=r.nextInt();
			
			int temp;
			//int temp1;
			
			if(num1>num2) {
				temp=num1;
				num1=num2;
				num2=temp;
				
				}
			if(num2>num3) {
				temp=num2;
				num2=num3;
				num3=temp;
			
			
			 if(num1>num2) {
				
				temp=num1;
				num1=num2;
				num2=temp;
				
			 }}
			
			System.out.println("The sorted numbers are "+num1+num2+num3);
			
			

	
	
	}

}

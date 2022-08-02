package kavyanshbansal;

import java.util.Scanner;

public class Number1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner r=new Scanner(System.in);
		
		int num1= (int)(Math.random()*9);
		int num2= (int)(Math.random()*9);
			
		if(num1<num2) {
			int temp;
			temp=num1;
			num1=num2;
		     num2=temp;
		     
		   
		}
		
		
	       System.out.printf("What is %d-%d",num1,num2);	
	       int x=r.nextInt();
		
		   int subtraction = num1-num2;
		   
		   if(subtraction==x) {
			   System.out.println("Congrats you gussed it right ");
		   }
		   else {
			   System.out.println("Sorry Try again");
		   }

	
	
	}

}

import java.util.Scanner;

/*public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int row =1;row<=4;row++) {
			for(int space=1;space<row;space++) {
				System.out.print(" ");
			}
				for(int j=row;j<=4;j++) {
					System.out.print("* ");
				
				}
				System.out.println();
				}
			
	
	}

}*/
public class Pattern1 {
	public static void main(String[] args) {
	
				//Steps 1,2: User enters two integers
				Scanner input = new Scanner(System.in);
				System.out.println("Enter the price: ");
				double price = input.nextDouble();
		
				System.out.println("Enter the annual interest rate: ");
				double rate = input.nextDouble();
		

			//	Step 3: Initialize years to 0
				int years = 0;
				
				// TODO: Write code for steps 4,5 here
				double netprice=0;
				double totalprice=0;
		       double x =2*price;
				while(price<x){
		            totalprice = price * (rate/100);
		            price=price+totalprice;
		            years++;
		        }
		    System.out.println(years);
		
	}
		}
	




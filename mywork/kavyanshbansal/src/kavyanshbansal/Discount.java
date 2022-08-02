package kavyanshbansal;

import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner r= new Scanner(System.in);
		
		System.out.println("Enter price of product: ");
		int price=r.nextInt();
		
		System.out.println("Enter quantity of product: ");
		int quantity=r.nextInt();
		
		 double totalprice = price*quantity;
		 System.out.println("The total price is "+totalprice);
		
		double discount;
		
		if(totalprice>100) {
			discount =0.5*totalprice;
			totalprice = totalprice -discount;
			System.out.println("Discount is : "+discount);
			System.out.println("Total price after discount  is : "+totalprice);
			
			
		}
	
		
	
	
	
	
	
	}

	
	
}

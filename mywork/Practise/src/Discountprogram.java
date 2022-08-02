import java.util.Scanner;

public class Discountprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		double price =0;
		double discount =0;
		double totalprice =0;
		
		System.out.print("Enter the number of items: ");
		int x = in.nextInt();
		
		System.out.print("Enter the price: ");
			for(int y=1;y<=x;y++) {
				double m = in.nextDouble();
				price+=m;
				
			}
		System.out.println("Welcome to Bansal group store private limited we hope you will have a nice experience with us!");
			
			if(price>=10) {
				
				discount = (price*10)/100;
				
				
				System.out.println("Congratulations you got a discount of "+discount);
			
				totalprice = price-discount;
				
				System.out.println("Price before discount "+price);
				System.out.println("Price after discount "+totalprice);
				System.out.println("Thanks for visiting us!Please visit again");
			}
			else {
				System.out.print("Your total bill is : "+price+" .");
				System.out.println("Thanks for visiting us!Please visit again");
			}
		
	}

}

package kavyanshbansal;

import java.util.Scanner;

public class Positive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner r=new Scanner(System.in);
		
		System.out.println("Enter the score");
		int score=r.nextInt();
		
		System.out.println("Enter your pay");
		double pay=r.nextDouble();
			if(score>90) {
				double pay1= 0.3*pay;
				pay =pay1 +pay;
				 System.out.println("Congrats your pay is inreased by 3% your new pay is"+pay);
			}
				
			
	
			else {
				System.out.println("Your pay is the same which is "+pay);
			}
	
	
	}
}

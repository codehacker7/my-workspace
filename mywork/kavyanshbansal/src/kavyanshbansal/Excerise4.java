package kavyanshbansal;

import java.util.Scanner;

public class Excerise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner r=new Scanner(System.in);
			
	     int  x= (int)(Math.random()*2);
	
			char chh = x==0? 'H':'T';
		
			System.out.println("Guess whether it is a head or a tail: ");
	         char guess=r.nextLine().charAt(0);
	         
	         
	         if(guess==x) {
	        	 System.out.println("Congtrats you got it");
	         }
	         else if(chh=='H') {
	        	 System.out.println("It was a head");
	         }
	         else {
	        	 System.out.println("It was a tail");
	         }
	         
			
	
	
	
	
	
	
	
	
	}

}

package kavyanshbansal;

import java.util.Scanner;

public class New {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner r=new Scanner(System.in);
		int n1= (int)(Math.random()*100);
		
		System.out.println("Guess the number between 1-100: ");
		int guess=r.nextInt();
		
		while(guess!=n1) {
			if(guess>n1) {				
				System.out.println("Too high try something low");
				guess=r.nextInt();}
			else {
				System.out.println("To low try something high");
				guess=r.nextInt();
			}
			}
			System.out.println("You got it");
	}

}

package kavyanshbansal;

import java.util.Scanner;

public class L05PRACTISE2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner r=new Scanner(System.in);
		
		System.out.println("Enter a character");
		char c=r.nextLine().charAt(0);
		 c=Character.toUpperCase(c);

		 int x = c -(char)'A' +10;
		 System.out.println(x);
	}

}

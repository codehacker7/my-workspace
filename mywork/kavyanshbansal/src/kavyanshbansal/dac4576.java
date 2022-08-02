package kavyanshbansal;

import java.util.Scanner;

public class dac4576 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			// now string is a method so we dont write charachter.toLowercase();
			Scanner r = new Scanner(System.in);
			
			System.out.println("Enter a character from A to F");
			String s = r.nextLine();
			s=s.toUpperCase();
			char ch =s.charAt(0);
			
			int value = ch - 'A' + 10;
			System.out.println(value);
			
			
	
	}
	
}




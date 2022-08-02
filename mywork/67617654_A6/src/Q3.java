import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	  Scanner r = new Scanner(System.in);
	
	  		System.out.println("Enter the positive integer: ");
	  		int s =r.nextInt();
	  
	  		
	  		
	  		if(isPalindrome(s)) {
	  			System.out.println(s+"is a palindrome");
	 	}
	  		else {
	  			System.out.println(s+"is not a palindrome");
	  	}
	
	
	}


		public static int reverse(int number) {
			
			 String number1 =""+number; 
			 String reverse ="";
			 
			 for(int i=number1.length()-1;i>=0;i--) {
				 	reverse = reverse + number1.charAt(i);
			 }
		
				return  Integer.parseInt(reverse);
		  
			 
		
		}
		
			public static boolean isPalindrome(int number1) {
				
				int y = reverse(number1);
				
				if(y==number1) {
					
						return true;
					
						}
				else {
					return false;
				}
				
					
					
			
			}
}

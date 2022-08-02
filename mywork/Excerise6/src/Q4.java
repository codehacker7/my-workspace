import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner r=new Scanner(System.in);
		
		System.out.println("Enter the password: ");
		String pass=r.nextLine();
		
		
		
		if(Validpassword(pass)==true) {
			System.out.println(pass+" is a Valid password ");
		}
		else {
			System.out.println(pass+" is a  Invalid password");
		}
		
		
		}



		public static boolean Validpassword(String s) {
			int count=0; 
			
			for( int i=0;i<s.length();i++) {
				char ch=s.charAt(i);
				boolean y=Character.isLetterOrDigit(ch);
				
					
				
				
				if(y==false) {
				    return false;
				    }	
				if(s.length()>=8 && Character.isLetterOrDigit(ch) ) {
							
							if(Character.isDigit(ch)) {
							count++;
						
						
						}
				}
			
			
			}
					if(count>=2  ) {
					
						return true;
					}
					else {
						return false;
					}
		
		
		
		
		}
}

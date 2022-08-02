import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner r=new Scanner(System.in);
			
			System.out.println("Enter the email: ");
			String email=r.nextLine();
			
			System.out.println(isValidEmail(email));
	
	}


		public static String isValidEmail(String email) {
			// check the charachter @
			
			if(email.indexOf("@")==-1  || email.indexOf("@")!=email.lastIndexOf("@") ) {
				return "Wrong email";
			}
			
		
				// limited to 255 charachters
			if(email.length()>=255) {
				return "Wrong email";
			}
		
		// contains only letters,numbers,_,@,.
		for(int i=0;i<email.length();i++) {
			char ch = email.charAt(i);
			boolean y1= Character.isLetter(ch);
			boolean y2=Character.isDigit(ch);
			if(y1==false && y2==false && ch!='-' && ch!='@' && ch!='.') {
				return "Incorrect";
			}
		}
		
	// does not contain any .., .@, @.,._. 
		if(email.contains("..") || email.contains(".@") || email.contains("@.") || email.contains("._.") ) {
			return "Incorrect";
		}
		
		// seperate username and domain
		
		
		
		int indexcalculate = email.indexOf("@");
		String username = email.substring(0, indexcalculate);
		String  domain = email.substring(indexcalculate+1);
		
		// limited to 64 characters
		if(username.length()>=64) {
			return "Incorrect email";
		}
		// starts with a letter
			
		  char ch1 = username.charAt(0);
			boolean y0= Character.isLetter(ch1);
			
			if(y0==false)
					return "Incorrect email";
			
			// atleast 3 characters
			
		   if(domain.length()<3) {
			   return "return false";
		   }
			
			// contains minimum dot '.'
		
		   	if(!domain.contains(".") && domain.endsWith(".")) {
		   		return "Incorrect email";
		   		
		   	}
		   	
		   	return "Valid email";

		
		
}}

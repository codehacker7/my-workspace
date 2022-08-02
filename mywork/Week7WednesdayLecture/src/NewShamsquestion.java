import java.util.Scanner;

public class NewShamsquestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner r=new Scanner(System.in);
		
		System.out.println("Enter the string: ");
		String s=r.nextLine();
		
		



	
	System.out.println("The number of letters is "+countLetters(s));
	System.out.println("The number of digits is "+countdigits(s));
	System.out.println("The number of special characters are "+countNonLetterorDigit(s));
	
	
	
	
	}
	

	public static int countLetters(String s) {
		
		int count =0;
		
		for(int i=0;i<s.length();i++){
			
			char ch = s.charAt(i);
			if(Character.isLetter(ch)) {
				count++;
				
			
			}
			}
		return count;
}

public static int countdigits(String s) {
	
int count =0;
		for(int i=0;i<s.length();i++) {
			char ch =s.charAt(i);
			if(Character.isDigit(ch)) {
				count++;
			
			}
		}

			return count;
}

public static int countNonLetterorDigit(String s) {
	
	int count=0;
	for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(Character.isLetterOrDigit(ch)) {
				continue;
			}
			else {
				count++;
			}
	
	}
	           return count;
	
	
	
	}
}
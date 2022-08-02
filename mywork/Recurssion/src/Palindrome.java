
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println(isPalindrome("hj"));
		
	
	String s  = "kavyansh";
	System.out.println(s.substring(1,s.length()-1));
	
	}
	
	
	
	
	public static boolean isPalindrome(String s) {
		
	
		if(s.length()<=1) {
			return true;
		}
		
		else if(s.charAt(0)!=s.charAt(s.length()-1)) {
			return false;
		}
		else
			return isPalindrome(s.substring(1,s.length()-1));

		
		
	}

}

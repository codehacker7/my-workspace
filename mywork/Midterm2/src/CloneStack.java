import java.util.Stack;

public class CloneStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static boolean isPalindrome(String s) {
		
		Stack<Character> c = new Stack<>();

	for(int i=0;i<s.length();i++) {
	char ch = s.charAt(i);
	 c.push(ch);
	}
		
		StringBuilder s2 = new StringBuilder();
		Stack<Character> s3 = (Stack<Character>) c.clone(); 
		
		while(!c.isEmpty()) {
	s2.append(s3.pop());
		}
		
		
		if(s.equals(s2.toString())) {
			return true;
		}
		else {
			return false;
		}
		
	}

		
	


}

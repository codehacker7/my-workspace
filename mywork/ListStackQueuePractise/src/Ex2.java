import java.util.Arrays;
import java.util.*;
public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		System.out.println(isPal("abcba"));
	
	
	
	
	
	}




public static boolean isPal(String s1) {
	Stack<Character> stack = new Stack<>();
	
	
	
	StringBuilder s3 = new StringBuilder();
	
	for(int i=0;i<s1.length();i++) {
		char ch = s1.charAt(i);
			stack.push(ch);
		}
	
	
	while(!stack.isEmpty()) {
		s3.append(stack.pop());

	
	
	}
	
	
	return s1.equals(s3.toString());
	
	
	
}







}

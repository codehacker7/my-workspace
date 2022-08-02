import java.util.Stack;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(isPal("kavyansh"));
		
	}
	
	
	
	public static boolean isPal(String s1) {
		
		Stack<Character> stack = new Stack<>();
		
		String s2 = "";
		
		
		StringBuilder s3 = new StringBuilder();
		
		for(int i=0;i<s1.length();i++) {
			stack.push(s1.charAt(i));
		}
		
		
		while(!stack.empty()) {
			//s2+=stack.pop();
			s3.append(stack.pop());
		
		}
		
		
		//return s1.equals(s2);
	
	return s1.equals(s2.toString());
	
	}

}

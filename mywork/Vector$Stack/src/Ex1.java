import java.util.Stack;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
System.out.println(isPal("UBC"));
		
		
		
	}

	
	public static boolean isPal(String s1) {
		Stack<Character> stack = new Stack<>();
		
		//String s2 ="";
// There is another class called StringBuilder which is more efficient


 StringBuilder s2 = new StringBuilder();// this means s2 = ""
		
		for(int i=0;i<s1.length();i++) {
			stack.push(s1.charAt(i));
		}
	
		while(!stack.isEmpty()) {
		//	s2+=stack.pop();
		s2.append(stack.pop());
		
		}
		
		// CAUTON:
		// if you used for(int i=0;i<stack.size();i++)
		//s2+=stack.pop();
		//this is wrong as stack.size() will always keep changing
	//	return s1.equals(s2);
	
		//now if use String builder you cannnot compare s1 to s2 directly  as s1 is a string and s2 is an memory address
		
		return s1.equals(s2.toString());
		
	}
	
	
		
		
	
	
	
}

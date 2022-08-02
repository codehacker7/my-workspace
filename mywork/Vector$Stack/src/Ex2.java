import java.util.Stack;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Stack<Character> stack = new Stack<>();
		
		stack.push('A');
		
				stack.push('B');
				stack.push('C');
				
	// so here the  thing is if i pop elements from the stack my stack size will eventually reduce to 0
	//but what if I just need to pop elements from the stack without making it empty 
				// so i can clone that stack and pop elements from the cloned stack
				
//	Stack<Character> stack2 = (Stack<Character>) stack.clone();
//	
//	while(!stack2.isEmpty())
//		System.out.println(stack2.pop());
//	
	
	

	
	for(int i=0;i<stack.size();i++) {
		System.out.println(stack.get(i));
	}
	
	
	
	
	
	}

}

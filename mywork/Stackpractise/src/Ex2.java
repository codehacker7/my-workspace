import java.util.Stack;
public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	Stack<Character> stack = new Stack<>();
	
	
	stack.push('A');
	stack.push('B');
	stack.push('C');
	
	Stack<Character> stack2 = (Stack<Character>)stack.clone();
	
	
	
	
	
	for(int i=0;i<stack.size();i++) {
		System.out.println();stack.get(i);
	}
	
	
	
	}

}

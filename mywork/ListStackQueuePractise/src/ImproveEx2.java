import java.util.Arrays;
import java.util.Stack;

public class ImproveEx2 {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
	
		
		System.out.println(stackmin(stack));
		
		
	}

	public static int stackmin(Stack<Integer> s1) {
		
Stack<Integer> s2 = (Stack<Integer>)s1.clone();

		int min = s2.pop();
	
		while(!s2.isEmpty()) {
			int element = s2.pop();
			if(min>element) {
				min = element;
			}
		}
		
		return min;
		
		
	}










}

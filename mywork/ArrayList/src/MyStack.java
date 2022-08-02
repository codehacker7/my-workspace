import java.util.ArrayList;

public class MyStack {

	
	private ArrayList list = new ArrayList();


	public boolean isEmpty() {
		
		return list.isEmpty();
		
		
	}

	public int size() {
		return list.size();
		
	}

	public Object peek() {
if(!isEmpty())	
return(list.get(list.size()-1));
else
	return null;
		
	}
	public Object pop() {
	if(!isEmpty())
		return list.remove(list.size()-1);
	else {
		return null;
	}
	}

	public void push(Object o) {
	list.add(o);	
	}
	
	
	public static void main(String[] args) {
		
		MyStack stack = new MyStack();
		
		stack.push("A");
		stack.push("k");
		stack.push("T");
		System.out.println(stack.size());
		System.out.println(stack.pop());
		System.out.println(stack.size());
		System.out.println(stack.peek());
		
		
		
		
	}
	
	
	

}

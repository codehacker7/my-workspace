import java.util.ArrayList;

public class MyStack {

	
	ArrayList list;


	
	public boolean isEmpty() {
		if(list.size()==0) {
			return true;
		}
		else {
			return false;
		}
	
	}
	
	
	
	
	public int getSize() {
		if(!list.isEmpty()) {
			return list.size();
		}
		
		
		else {
			return 0;
		}
	}
	
	
	
	
	public Object peek() {
		
		if(!list.isEmpty()) {
			return list.get(list.size()-1);
		}
		else {
			return "list is empty";
		}
		
	}
	
	public Object pop() {
		
		Object x = list.remove(list.size()-1);
		
		return x;
		
		
		
		
	}
	
	public void push(Object o) {
		
		list.add(o);
		
		
	}
	
	
	
	
}

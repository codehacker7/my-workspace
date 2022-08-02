import java.util.ArrayList;

public class MyStack2 extends ArrayList {

	
	public boolean isEmpty() {return super.isEmpty();}
	public int getSize() {return size();}
	public Object peek() {
	if (getSize() > 0) return get(getSize() - 1);
	else return null;
	}
	public Object pop() {
	if (getSize() > 0) return remove(getSize() - 1);
	else return null;
	}
	public void push(Object o) {
		add(o); 
		
	}
	public String toString() {
		
		return "stack: " + toString(); }
	
	
}

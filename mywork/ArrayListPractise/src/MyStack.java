import java.util.ArrayList;

public class MyStack{

	
	ArrayList<Object> list = new ArrayList<>();

	
	public boolean isEmpty() {
		
	return (list.size()==0)?true:false;
	
	}
	
	
	public int getSize() {
		
		int count =0;
		for(Object item:list) {
			count++;
		}
		
		return count;
	}
	
	public Object peek() {
		
		return list.get(list.size()-1);
		
		}
	
	
	public Object pop() {
		return list.remove(list.size()-1);
	}
	
	public void push(Object o) {
		list.add(o);
	}
	
	
}

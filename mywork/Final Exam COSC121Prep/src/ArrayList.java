import java.awt.datatransfer.SystemFlavorMap;

public class ArrayList<E> {

	private int size =0;
	private static final int capacity = 100;
	
	E[] data = (E[]) new Object[capacity];
	
	
	public int size() {
		return size;
	}
	
	
	public boolean isEmpty() {
		return size==0;
	}
	
	public void add(int index,E e) {
		
		
		if(size>=data.length) {
		 E[] newdata = (E[]) new Object[2*size+1];
		
		 System.arraycopy(data, 0, newdata, 0, data.length);
		
		data = newdata;
		
		
		}
		
		
		for(int i=size-1;i>=index;i--) {
			data[i+1]=data[i];
		}
		
		data[index]= e;
		
		size++;
		
		
	
		
		
		
		
	}
	
	
	public E remove(int index){
		
		
		
		E returning = data[index];
		
		
		
		
		
		
		for(int i=index;i<size-1;i++) {
			data[i]=data[i+1];
		}
		data[size-1]=null;
		size--;
		return returning;
	}
	
	
	
}

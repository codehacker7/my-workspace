
public class MyArrayList<E> {

	private static final int INTIL_CAP =10;
	private int size =0;
	
	E[] data = (E[])new Object[INTIL_CAP];
	
	public void add(E e) {
		
		add(size,e);
		
		
		
		
	}
	
	public void add(int idx,E e) {
if(size==data.length) {
			
			E[] newdata = (E[]) new Object[2*data.length+1];

				System.arraycopy(data, 0, newdata,0,data.length);
		
				data = newdata;
		
		}

		for(int i=size-1;i>=idx;i--) {
			
			data[i+1]=data[i];
		}

		data[idx] = e;
		size++;
		
		
		
	}
	
	public E remove(int idx) {
		
		
		E oldvalue = data[idx];
		
		for(int i=idx;i<size-1;i++) {
			data[i] = data[i+1];
		}
		data[size-1]=null;
		size--;
		return oldvalue;
		
		
		
	}
	
	
	
	public boolean remove(E e) {
		
		
		
		
		
		
		for(int i=0;i<size;i++) {
			if(data[i].equals(e)) {
				 remove(i);
			return true;
			}
		}
	
		return false;
		
		
	}
	
	    
	
	
	
	
	
	
}

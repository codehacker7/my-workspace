
public class Customer implements Comparable<Customer> {

	private int order;
	private String name;
	
	
	
	
	public Customer(String name,int order) {
		setName(name);
		setOrder(order);
	}
	
	public int getOrder() {
		return order;
	}
	public void setOrder(int order) {
		this.order = order;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		 this.name = name;
	}
	
	public String toString() {
		return "Name :  "+getName()+" "+"Order No: "+getOrder();
	}

	@Override
	public int compareTo(Customer o) {
		// TODO Auto-generated method stub
		if(this.order>o.order) {
			return -1;
		}
		else if(o.order>this.order) {
			return 1;
		}
		else {
			return 0;
		}
	}
	
	
}

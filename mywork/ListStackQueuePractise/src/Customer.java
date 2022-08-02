
public class Customer implements Comparable<Customer>{

private	String name;
	private int order;
	
	public Customer(String name,int order){
		setName(name);
		setOrder(order);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}

	@Override
	public int compareTo(Customer o) {
		// TODO Auto-generated method stub
		//return this.getOrder()-o.getOrder();
	
		return this.getOrder()-o.getOrder();
		
	
	}

}

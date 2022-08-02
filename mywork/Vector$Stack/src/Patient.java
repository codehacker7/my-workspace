
public  class Patient {
private int order;
private String name;
private boolean emergencyCase;



public Patient(int order,String name,boolean emergencyCase) {
	setOrder(order);
	setName(name);
	setEmergencyCase(emergencyCase);
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
public boolean isEmergencyCase() {
	return emergencyCase;
}
public  void setEmergencyCase(boolean emergencyCase) {
	this.emergencyCase = emergencyCase;
}
	public String toString() {
		return name;
	}
	

	
}

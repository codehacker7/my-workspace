
public class Faculty extends Employee {
private String officeHour;
private String rank;

Faculty(){
}


Faculty(String name,String address,String phone,String email,String officeHour,String rank){

	super(name,address,phone,email);
	setOfficeHour(officeHour);
	setRank(rank);
}



public String getOfficeHour() {
	return officeHour;
}
public void setOfficeHour(String officeHour) {
	this.officeHour = officeHour;
}
public String getRank() {
	return rank;
}
public void setRank(String rank) {
	this.rank = rank;
}
	
public String toString() {
	return super.toString()+", officeHour="+officeHour+", rank="+rank;
}
	
	
	
	
	
	
}

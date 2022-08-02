
public class Staff extends Employee {
private String title;

Staff(){
setTitle(null);
}



Staff(String name,String address,String phone,String email,String title){
	super(name,address,phone,email);
	setTitle(title);
}



public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public String toString() {
	return super.toString() +", title="+title;
			
}
	
	
	



	
}

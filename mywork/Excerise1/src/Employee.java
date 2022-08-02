import java.util.Date;
public class Employee extends Person {
	
	private String office;
	private int salary;
	private Date datehired;
	

	Employee(){
		
	
	}
	Employee(String name,String address,String phone,String email){
		super(name,address,phone,email);
	}
	Employee(String name,String address,String phone,String email,String office,int salary,Date datehired){
		super(name,address,phone,email);
		setOffice(office);
		setSalary(salary);
		setDatehired(datehired);
	
	}
	
	
	public String getOffice() {
		return office;
	}
	public void setOffice(String office) {
		this.office = office;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Date getDatehired() {
		return datehired;
	}
	public void setDatehired(Date datehired) {
		this.datehired = datehired;
	}
	
	public String toString() {
		return super.toString() + ", Office=" + office + ", salary=" + salary + ", dateHired=" + datehired;
	}	
	
	
}


public class Employees implements Comparable<Employees>,Cloneable {

	double salary;
	String name;
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}

	Employees(int salary, int age,String name){
		setSalary(salary);
		setName(name);
	}
	
	Employees(){
		this(10000,23,"Adam");
	}
	
	public int compareTo(Employees o) {
		// TODO Auto-generated method stub
	if(this.salary>o.salary) {
		return 1;
	}
	else if(o.salary>this.salary) {
		return -1;
	}
	else {
		return 0;
	}
	
	
	
	
	
}}
	

	
	



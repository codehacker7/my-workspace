
public class Employee implements Comparable<Employee> {
int salary,hireYear;
String name;

public Employee() {
	
}

public Employee(int salary,int hireYear,String name) {
	setSalary(salary);
	setHireYear(hireYear);
	setName(name);

	

}

private void setName(String name) {
	// TODO Auto-generated method stub
	this.name=name;
}

public int getSalary() {
	return salary;
}

public int getHireYear() {
	return hireYear;
}

public String getName() {
	return name;
}

private void setHireYear(int hireYear) {
	// TODO Auto-generated method stub
	this.hireYear=hireYear;
}

private void setSalary(int salary) {
	// TODO Auto-generated method stub
	this.salary = salary;
}

@Override
public int compareTo(Employee o) {
	return this.salary-o.salary;
	
	//	
//	if(this.salary>o.salary)
//		return 1;
//	
//	else if(o.salary>this.salary)
//		return -1;
//	else
//		return 0;
//
}







}

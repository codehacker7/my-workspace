import java.util.Arrays;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Employee e1 = new Employee(1000,2008,"Bob");
	Employee e2 = new Employee(2000,2005,"Emily");
	
	Employee[] employees = {e2,e1};
	Arrays.sort(employees);

	
	for(Employee e :employees) {
		System.out.println(e.name);
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	}

}

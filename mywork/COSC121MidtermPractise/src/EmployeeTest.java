import java.util.Arrays;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employees e1 = new Employees(20000,23,"Bob");
		Employees e2 = new Employees(10000,23,"Adam");
		
		
		Employees[] e = {e2,e1};
		
		Arrays.sort(e);
		for(Employees o:e) {
			System.out.println(o.getName());
		}
		
	}

}

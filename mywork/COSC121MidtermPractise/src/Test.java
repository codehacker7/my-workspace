
public class Test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Cloneablec c1 = new Cloneablec(30,40);
		Cloneablec c2 = (Cloneablec)c1.clone();
		
		c1.b.salary=10000;
		c2.b.salary=20000;
		
		
		

		
		
		
		
	}

}

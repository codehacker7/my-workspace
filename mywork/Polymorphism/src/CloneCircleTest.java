
public class CloneCircleTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub

	Circle c1 = new Circle(1,"red",true);
	Circle c2 = (Circle)c1.clone();
		
	
	
	System.out.println(c1.toString());
	
	System.out.println(c2.toString());
	
	}

}


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Shape c = new Circle(1);
		Shape m = new Rectangle(2,3);
		System.out.println(c.toString());
		System.out.println(c.getArea());
	
		
		
		
	}
	
	public static void print(Shape shp) {
		System.out.println(shp.toString());
	}

}

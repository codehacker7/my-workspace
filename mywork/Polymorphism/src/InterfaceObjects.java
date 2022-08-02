
public class InterfaceObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Drawable c = new Car();
	//but you cannot create
	//Drawable c = new Drawable();
	
	c.draw();
//	c.setColour();  // you can just call those methods which are known to drawable

Drawable c1 = new Circle(1);

	Circle c5 = (Circle)c1;
	
	System.out.println(c5.getArea());
	System.out.println(((Circle)c1).getArea());
	}

}

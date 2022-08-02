
public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-ge

		
				System.out.println(Circle.numberofobjects);
		
		//	Circle c1 = new Circle();
		//	Circle c2 = new Circle(18);
		
		//	System.out.println(Circle.numberofobjects);
		
		//	System.out.println(c2.getradius());
				
		//	enlarge(c2);
				
		//	System.out.println(c2.getradius());
			
			Circle[] circles = new Circle[4];
			
			for(int i=0;i<circles.length;i++) {
				circles[i]= new Circle();
			}
			for(int i=0;i<circles.length;i++) {
				System.out.println(circles[i].radius);
			}
			
			
			
		
	}
	
	
	public static void enlarge(Circle x) {
		x.radius++;
	}

}
